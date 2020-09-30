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

    //@Autowired
    //private RoleService _roleService;

    @Autowired
    private StateService _stateService;



    @RequestMapping("/admin")
    public String viewHomePage(Model model){
        List<User> listUsers = _userService.listAll();
        model.addAttribute("listUsers", listUsers);
        return "admin_dashboard";
    }

    @RequestMapping("/")
    public String viewDevPage(){
        return "dev_landing_page";
    }


    @RequestMapping("/update-profile")
    public String addNewUserProfile(Model model){
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

        return "new_user_profile";
    }

    @RequestMapping(value = "/user/updated", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        _userService.save(user);
        //TODO Add logic for email sender
        return "user_updated_redirect";
    }

    @RequestMapping("edit/{id}")
    public ModelAndView showEditProfileForm(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_profile");
        User user = _userService.get(id);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id){
        _userService.delete(id);
        return "redirect:/";
    }



}
