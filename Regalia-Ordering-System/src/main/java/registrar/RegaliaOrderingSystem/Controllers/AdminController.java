/**
 * This Class Manages Rest Calls to the Admin Dashboard.
 * All Required dependencies are declared at the top of the page
 *
 * The Annotation @Autowired allows for dependency injection of the specified service.
 *
 *
 * @version 1.0
 * @author Steven Buglione
 *
 */



package registrar.RegaliaOrderingSystem.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Models.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserService _userService;

    @Autowired
    private CapSizeService _capSizeService;

    @Autowired
    private CeremonyService _ceremonyService;

    @Autowired
    private DegreeService _degreeService;

    @Autowired
    private DepartmentService _departmentService;

    @Autowired
    private StateService _stateService;

    @Autowired
    private AuthService _authService;

    @Value("${casLogoutUrl}")
    private String casLogoutUrl;



    //Admin Dashboard routes
    @RequestMapping("/admin_page_active_users")
    public String viewAdminActiveUsers(HttpServletRequest request, Model model){

        //Get user CWID from principal
        String CWID = _authService.getUserCWID(request);

        //Get the user Logged in
        User admin = _userService.getUserByUsername(CWID);

        //Provide admin Details to model
        model.addAttribute("admin", admin);

        //Logout url
        model.addAttribute("logout", casLogoutUrl);

        //TODO add logic for only grabbing active users
        List<User> activeUsers = _userService.listAll("enabled");

        //User Data
        model.addAttribute("activeUsers",activeUsers);

        //Return the active user page with active users
        return "admin/admin_page_active_users";
    }

    @RequestMapping("/admin_page_archived_users")
    public String viewAdminArchivedUsers(HttpServletRequest request, Model model){

        //Get user CWID from principal
        String CWID = _authService.getUserCWID(request);

        //Get the User Logged in
        User admin = _userService.getUserByUsername(CWID);

        //Provide admin Details to model
        model.addAttribute("admin", admin);

        //Logout url
        model.addAttribute("logout", casLogoutUrl);

        //TODO add logic for only grabbing active users
        List<User> inactiveUsers = _userService.listAll("disabled");

        //User Data
        model.addAttribute("inactiveUsers",inactiveUsers);

        return "admin/admin_page_archived_users";
    }

    //Grabs user by their id and returns the user
    @RequestMapping("edit/{id}")
    public ModelAndView showEditProfileForm(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_profile");
        User user = _userService.get(id);
        mav.addObject("user", user);
        return mav;
    }

    //Grabs user by their id and returns the user
    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id){
        _userService.delete(id);
        return "redirect:/";
    }
}
