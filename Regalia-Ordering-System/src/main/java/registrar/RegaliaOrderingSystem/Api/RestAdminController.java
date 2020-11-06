/**
 * The RestAdminController is a api that allows the user update/delete/restore a user using restfull endpoints
 *
 * @version 1.0
 * @author Steven Buglione
 *
 */



package registrar.RegaliaOrderingSystem.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Dto.UserDto;
import registrar.RegaliaOrderingSystem.Models.Role;
import registrar.RegaliaOrderingSystem.Models.User;

import java.util.Objects;
import java.util.Set;

@RestController
public class RestAdminController {

    private UserService _userService;
    private CapSizeService _capSizeService;
    private CeremonyService _ceremonyService;
    private DegreeService _degreeService;
    private DepartmentService _departmentService;
    private StateService _stateService;
    private RoleService _roleService;

    @Autowired
    private RestAdminController(UserService userService, CapSizeService capSizeService, CeremonyService ceremonyService,
                            DegreeService degreeService, DepartmentService departmentService, StateService stateService, RoleService roleService){
        this._userService = userService;
        this._capSizeService = capSizeService;
        this._ceremonyService = ceremonyService;
        this._degreeService = degreeService;
        this._departmentService = departmentService;
        this._stateService = stateService;
        this._roleService = roleService;
    }

    //Post API Request to archive a user from the database
    @PostMapping(path= "/user/delete/{id}", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(
            @PathVariable String id)
            throws Exception
    {
        _userService.deleteUserById(id);
        return "Successful Delete User Request";

    }

    //Post API Request to restore a user from the database
    @PostMapping(path= "/user/restore/{id}", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String restoreUser(
            @PathVariable String id)
            throws Exception
    {
        _userService.restoreUserById(id);
        return "Successful Restore User Request";
    }

    //Get Api request to get a user by username
    @GetMapping(path= "/user/{id}",  produces = "application/json")
    public UserDto getUserByUsername(@PathVariable String id)
            throws Exception
    {

        //Get Instance of user from database
        User user = _userService.getUserByUsername(id);

        //Get the Set of roles that a user has
        Set<Role> role = user.getRoles();

        //Take the first role of a user since you can only be a A user or a admin
        Role userRole = role.stream().findFirst().get();

        //Take the role name and store in variable to send in request
        String stringRole = userRole.getName();

        UserDto userDto = new UserDto(
                user.getEmail(),
                user.getUsername(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getPhone_number(),
                user.getCeremony_date().getName(),
                user.getCap_size().getFitted(),
                user.getDegree().getName(),
                user.getDepartment().getName(),
                user.getWeight(),
                user.getHeight_feet(),
                user.getHeight_inches(),
                user.getGranting_institution(),
                user.getGranting_city(),
                user.getGranting_state().getName(),
                user.getLast_updated(),
                stringRole

        );

        //Return instance of user to client
        return userDto;
    }


    //Post Api request to update user
    @PostMapping(path = "/user/edit/{id}", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String updateUser(@PathVariable String id, @RequestBody UserDto userDto){

        //Get Existing User in database
        User user = _userService.getUserByUsername(id);

        //Update the user object with the userDto values
        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setPhone_number(userDto.getPhone_number());
        user.setWeight(userDto.getWeight());
        user.setHeight_feet(userDto.getHeight_feet());
        user.setHeight_inches(userDto.getHeight_inches());
        user.setGranting_institution(userDto.getGranting_institution());
        user.setGranting_city(userDto.getGranting_city());
        user.setEmail(userDto.getEmail());
        user.setCap_size(_capSizeService.getCapSizeByName(userDto.getCap_size()));
        user.setCeremony_date(_ceremonyService.getCermonyByName(userDto.getCeremony_date()));
        user.setDegree(_degreeService.getDegreeByName(userDto.getDegree()));
        user.setDepartment(_departmentService.getDepartmentIdByName(userDto.getDepartment()));
        user.setGranting_state(_stateService.getStateIdByName(userDto.getGranting_state()));
        user.setRoles(_roleService.listOfUserRole(userDto.getRole()));


        //Update the Database with the updated user
        _userService.save(user);

        //Return 200 ok
        return "User has been updated";
    }

    @PostMapping(path = "/user/add", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String newUser(@RequestBody UserDto userDto) {

        // Create a new user
        User user = new User();

        user.setUsername(userDto.getUsername());
        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setPhone_number(userDto.getPhone_number());
        user.setWeight(userDto.getWeight());
        user.setHeight_feet(userDto.getHeight_feet());
        user.setHeight_inches(userDto.getHeight_inches());
        user.setGranting_institution(userDto.getGranting_institution());
        user.setGranting_city(userDto.getGranting_city());
        user.setEmail(userDto.getEmail());
        user.setCap_size(_capSizeService.getCapSizeByName(userDto.getCap_size()));
        user.setCeremony_date(_ceremonyService.getCermonyByName(userDto.getCeremony_date()));
        user.setDegree(_degreeService.getDegreeByName(userDto.getDegree()));
        user.setDepartment(_departmentService.getDepartmentIdByName(userDto.getDepartment()));
        user.setGranting_state(_stateService.getStateIdByName(userDto.getGranting_state()));
        user.setRoles(_roleService.listOfUserRole(userDto.getRole()));

        //Update the Database with the updated user
        _userService.save(user);

        return "New user has been added";
    }

}
