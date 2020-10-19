/**
 * AuthController is the entry point of our application
 * First the Client authenticates them selves withe Marist Cas System
 * Once Authenticated Marist Cas System provides a Ticket that contains the Users CWID
 * AuthController then looks up the user in the system
 * If a user is not found a new user is created and stored in the database with the role of user
 * The user is then routed to the User form page to update there profile
 * If the user is found then AuthController then looks up there Roles
 * If the user is a Admin they are routed to the Admin Dashboard
 * If the user is a User only they are routed to the Update User Profile page
 * @Value annotation is used to set the logout url for the Marist cas System
 *
 * @version 1.0
 * @author Steven Buglione
 *
 */


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
import registrar.RegaliaOrderingSystem.Dao.Service.AuthService;
import registrar.RegaliaOrderingSystem.Dao.Service.RoleService;
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

    private AuthService _authService;
    private UserService _userService;
    private RoleService _roleService;

    @Autowired
    private AuthController(AuthService authService, UserService userService, RoleService roleService){
        this._authService = authService;
        this._userService = userService;
        this._roleService = roleService;
    }



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

        //Create Instance of User Object
        User user = new User();

        //If the User does not exist Generate them in the database
        if (_userService.doesUserExist(CWID) != true) {

            //Get "USER" role from database
            Role UserRole = _roleService.getRoleByName("ADMIN");

            //Update Instance of user Object with New Role
            user.setRoles(_userService.setUserRoles(UserRole));

            //Update Instance of user Object with CWID
            user.setUsername(CWID);

            //Save the User In the database
            _userService.save(user);
        }

        //If the User does exist update there record in local user object
        user = _userService.getUserByUsername(CWID);

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
