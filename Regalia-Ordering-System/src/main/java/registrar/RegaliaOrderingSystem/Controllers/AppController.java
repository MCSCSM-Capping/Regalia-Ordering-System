package registrar.RegaliaOrderingSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserDataRepository;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Models.*;

import java.util.List;

@Controller
public class AppController {

    //Dependency Injection for Services
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


    //Development Route used to plan out how the application should work
    @RequestMapping("/")
    public String viewDevPage(){
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

    //Admin Dashboard routes
    @RequestMapping("/admin_page_active_users")
    public String viewAdminActiveUsers(){
        return "admin/admin_page_active_users";
    }

    @RequestMapping("/admin_page_archived_users")
    public String viewAdminArchivedUsers(){
        return "admin/admin_page_archived_users";
    }


    //Error handling routes
    @RequestMapping("/403")
    public String viewError403(){
        return "error/403";
    }

    @RequestMapping("/404")
    public String viewError404(){
        return "error/404";
    }

    @RequestMapping("/500")
    public String viewError500(){
        return "error/500";
    }

}
