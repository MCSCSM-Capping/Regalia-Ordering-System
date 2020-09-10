package registrar.RegaliaOrderingSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import registrar.RegaliaOrderingSystem.Dao.Service.FacultyService;
import registrar.RegaliaOrderingSystem.Models.Faculty;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private FacultyService _facultyService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Faculty> listFaculty = _facultyService.listAll();
        model.addAttribute("listFaculty", listFaculty);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewFormPage(Model model){
        Faculty faculty = new Faculty();
        model.addAttribute("faculty", faculty );
        return"new_faculty_order_form";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditFacultyForm(@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("edit_faculty_order_form");
        Faculty faculty = _facultyService.get(id);
        mav.addObject("faculty", faculty);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteFacultyOrder(@PathVariable("id") int id){
        _facultyService.delete(id);
        return "redirect:/";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveFacultyOrder(@ModelAttribute("faculty") Faculty faculty){
        _facultyService.save(faculty);
        return "redirect:/";
    }
}
