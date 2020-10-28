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
import registrar.RegaliaOrderingSystem.Dto.UserDto;
import registrar.RegaliaOrderingSystem.Models.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller

public class UserController {

    private UserService _userService;
    private CapSizeService _capSizeService;
    private CeremonyService _ceremonyService;
    private DegreeService _degreeService;
    private DepartmentService _departmentService;
    private StateService _stateService;
    private AuthService _authService;

    @Autowired
    private UserController(UserService userService, CapSizeService capSizeService, CeremonyService ceremonyService,
                           DegreeService degreeService, DepartmentService departmentService, StateService stateService, AuthService authService){
        this._userService = userService;
        this._capSizeService = capSizeService;
        this._ceremonyService = ceremonyService;
        this._degreeService = degreeService;
        this._departmentService = departmentService;
        this._stateService = stateService;
        this._authService = authService;
    }


    //Route to generate new user profile
    @RequestMapping("/update-profile")
    public String newUserProfile(HttpServletRequest request, Model model){

        String CWID = _authService.getUserCWID(request);


        User user = _userService.getUserByUsername(CWID);

        //Generate userDto
        UserDto userDto = new UserDto();

        if(Objects.isNull(user.getFirst_name())){
            user = new User();
        }else{
            userDto.setEmail(user.getEmail());
            userDto.setUsername(user.getUsername());
            userDto.setFirst_name(user.getFirst_name());
            userDto.setLast_name(user.getLast_name());
            userDto.setPhone_number(user.getPhone_number());
            userDto.setCeremony_date(user.getCeremony_date().getName());
            userDto.setCap_size(user.getCap_size().getFitted());
            userDto.setDegree(user.getDegree().getName());
            userDto.setDepartment(user.getDepartment().getName());
            userDto.setWeight(user.getWeight());
            userDto.setHeight_inches(user.getHeight_inches());
            userDto.setGranting_city(user.getGranting_city());
            userDto.setGranting_institution(user.getGranting_institution());
            userDto.setGranting_state(user.getGranting_state().getName());
        }



        model.addAttribute("user", userDto);

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

        model.addAttribute("CWID", CWID);




        return "user/new_user_profile";
    }

    
    //Form post request to update the user records
    @RequestMapping(value = "/user/updated", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserDto userDto){

        User user = _userService.getUserByUsername(userDto.getUsername());
        System.out.println(userDto.getUsername());


        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setPhone_number(userDto.getPhone_number());
        user.setWeight(userDto.getWeight());
        user.setHeight_inches(userDto.getHeight_inches());
        user.setGranting_institution(userDto.getGranting_institution());
        user.setGranting_city(userDto.getGranting_city());
        user.setEmail(userDto.getEmail());
        user.setCap_size(_capSizeService.getCapSizeByName(userDto.getCap_size()));
        user.setCeremony_date(_ceremonyService.getCermonyByName(userDto.getCeremony_date()));
        user.setDegree(_degreeService.getDegreeByName(userDto.getDegree()));
        user.setDepartment(_departmentService.getDepartmentIdByName(userDto.getDepartment()));
        user.setGranting_state(_stateService.getStateIdByName(userDto.getGranting_state()));

        //Save the newly created user Object
        _userService.save(user);

        return "user/user_updated_redirect";
    }



}
