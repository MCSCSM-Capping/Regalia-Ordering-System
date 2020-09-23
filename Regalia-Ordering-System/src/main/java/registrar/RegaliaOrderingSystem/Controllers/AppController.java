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
import registrar.RegaliaOrderingSystem.Dao.Service.UserService;
import registrar.RegaliaOrderingSystem.Models.Department;
import registrar.RegaliaOrderingSystem.Models.User;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService _userService;

    @RequestMapping("/admin")
    public String viewHomePage(Model model){
        List<User> listUsers = _userService.listAll();
        model.addAttribute("listUsers", listUsers);
        return "admin_dashboard";
    }


    @RequestMapping("/new")
    public String addNewUserProfile(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "new_user_profile";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        _userService.save(user);
        return "redirect:/";
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

    @RequestMapping("/")
    public String viewHomePage() {

        return "index";
    }

}
