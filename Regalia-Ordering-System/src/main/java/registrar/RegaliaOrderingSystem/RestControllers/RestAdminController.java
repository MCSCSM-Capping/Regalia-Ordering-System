package registrar.RegaliaOrderingSystem.RestControllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Dto.RestUserDto;

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
}
