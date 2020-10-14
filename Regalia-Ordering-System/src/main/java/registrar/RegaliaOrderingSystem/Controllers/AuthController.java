package registrar.RegaliaOrderingSystem.Controllers;

import org.jasig.cas.client.boot.configuration.CasClientConfigurer;
import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserRepository;
import registrar.RegaliaOrderingSystem.Dao.Service.AuthService;
import registrar.RegaliaOrderingSystem.Dao.Service.UserService;
import registrar.RegaliaOrderingSystem.Models.Role;
import registrar.RegaliaOrderingSystem.Models.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@EnableCasClient
public class AuthController implements CasClientConfigurer {

    @Autowired
    private AuthService _authService;

    @Autowired
    private UserService _userService;

    @Autowired
    private UserRepository userRepository;


    @Value("${casLogoutUrl}")
    private String casLogoutUrl;

    public String getCasLogoutUrl(){
        return casLogoutUrl;
    }

    @RequestMapping("/")
    public ModelAndView authenticateUserAndRedirect(HttpServletRequest request, Model model){
        //Get user CWID from principal
        String CWID = _authService.getUserCWID(request);
        model.addAttribute("CWID", CWID);

        //Checks if user Exists in database
        Boolean hasUser = _userService.doesUserExist(CWID);
        User user = new User(CWID);

        //If the User does not exist Generate them in the database
        if (hasUser != true) {
            _userService.save(user);
        }

        //If the User does exist update there record in local user object
        user = userRepository.getUserByUsername(CWID);

        //Get the users roles
        Set<Role> roles = user.getRoles();

        //Create a list to store the user roles
        List<String> listOfRoles = new ArrayList<>();

        //Add all the Users roles to the list
        for (Role role : roles) {
            listOfRoles.add(role.getName());
        }

        //If a user is a Admin return the admin page
        if(listOfRoles.contains("ADMIN") == true){
            return new ModelAndView("redirect:/admin_page_active_users");
        }

        //Return the User Page
        return new ModelAndView("redirect:/update-profile");
    }

    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        validationFilter.getInitParameters().put("millisBetweenCleanUps", "120000");
    }
}
