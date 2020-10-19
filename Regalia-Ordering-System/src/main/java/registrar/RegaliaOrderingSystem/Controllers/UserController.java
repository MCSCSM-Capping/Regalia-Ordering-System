/**
 * The User Controller Manages How users are generated in the system
 * @Value annotation is used to set the logout url for the Marist cas System
 *
 * @version 1.0
 * @author Steven Buglione
 *
 */




package registrar.RegaliaOrderingSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Models.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller

public class UserController {

    private UserService _userService;
    private CapSizeService _capSizeService;
    private CeremonyService _ceremonyService;
    private DegreeService _degreeService;
    private DepartmentService _departmentService;
    private StateService _stateService;

    @Autowired
    private UserController(UserService userService, CapSizeService capSizeService, CeremonyService ceremonyService,
                           DegreeService degreeService, DepartmentService departmentService, StateService stateService){
        this._userService = userService;
        this._capSizeService = capSizeService;
        this._ceremonyService = ceremonyService;
        this._degreeService = degreeService;
        this._departmentService = departmentService;
        this._stateService = stateService;
    }


    //Development Route used to plan out how the application should work
    @RequestMapping("/test")
    public String viewDevPage(Model model){
        return "user/dev_landing_page";
    }


    //Route to generate new user profile
    @RequestMapping("/update-profile")
    public String newUserProfile(Model model){

        User user = new User();
        model.addAttribute("user", user);

        List<CapSize> capSizes = _capSizeService.listAll();
        model.addAttribute("capSizes", capSizes);

        List<Ceremony> ceremonies = _ceremonyService.listAll();
        model.addAttribute("ceremonies", ceremonies);

        List<Degree> degrees = _degreeService.listAll();
        model.addAttribute("degrees", degrees);

        List<Department> departments = _departmentService.listAll();
        model.addAttribute("departments", departments);

        List<State> states = _stateService.listAll();
        model.addAttribute("states", states);

        return "user/new_user_profile";
    }

    
    //Form post request to update the user records
    @RequestMapping(value = "/user/updated", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        _userService.save(user);
        //TODO Add logic for email sender
        return "user/user_updated_redirect";
    }

}
