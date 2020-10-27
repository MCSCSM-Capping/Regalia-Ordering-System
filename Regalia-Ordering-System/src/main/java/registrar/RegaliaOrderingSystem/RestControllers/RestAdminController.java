package registrar.RegaliaOrderingSystem.RestControllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Dto.RestUserDto;
import registrar.RegaliaOrderingSystem.Dto.UserDto;
import registrar.RegaliaOrderingSystem.Models.User;

@RestController
public class RestAdminController {

    private UserService _userService;
    private CapSizeService _capSizeService;
    private CeremonyService _ceremonyService;
    private DegreeService _degreeService;
    private DepartmentService _departmentService;
    private StateService _stateService;
    private AuthService _authService;

    @Autowired
    private RestAdminController(UserService userService, CapSizeService capSizeService, CeremonyService ceremonyService,
                            DegreeService degreeService, DepartmentService departmentService, StateService stateService, AuthService authService){
        this._userService = userService;
        this._capSizeService = capSizeService;
        this._ceremonyService = ceremonyService;
        this._degreeService = degreeService;
        this._departmentService = departmentService;
        this._stateService = stateService;
        this._authService = authService;
    }

    //Post API Request to archive a user from the database
    @PostMapping(path= "/delete", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(
            @RequestBody String username)
            throws Exception
    {

        RestUserDto user = new ObjectMapper().readValue(username, RestUserDto.class);


        System.out.println(user.getUsername());

        //add resource
        _userService.deleteUserById(user.getUsername());


        //Send location in response
        return "Successful Post Request";

    }

    //Post API Request to restore a user from the database
    @PostMapping(path= "/restore", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String restoreUser(
            @RequestBody String username)
            throws Exception
    {

        RestUserDto user = new ObjectMapper().readValue(username, RestUserDto.class);


        System.out.println(user.getUsername());

        //add resource
        _userService.restoreUserById(user.getUsername());


        //Send location in response
        return "Successful Post Request";
    }

    //Get Api request to get a user by username
    @GetMapping(path= "/user/{id}",  produces = "application/json")
    public UserDto getUserByUsername(@PathVariable String id)
            throws Exception
    {

        User user = _userService.getUserByUsername(id);

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
                user.getHeight_inches(),
                user.getGranting_institution(),
                user.getGranting_city(),
                user.getGranting_state().getName(),
                user.getLast_updated(),
                user.getRoles()
        );

        return userDto;
    }
}
