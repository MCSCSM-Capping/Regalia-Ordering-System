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
import org.springframework.web.bind.annotation.*;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;
import registrar.RegaliaOrderingSystem.Dao.Service.*;
import registrar.RegaliaOrderingSystem.Dto.UserDto;
import registrar.RegaliaOrderingSystem.Models.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;

@Controller
public class AdminController {

    private UserService _userService;
    private CapSizeService _capSizeService;
    private CeremonyService _ceremonyService;
    private DegreeService _degreeService;
    private DepartmentService _departmentService;
    private StateService _stateService;
    private AuthService _authService;
    private RoleService _roleService;

    @Value("${casLogoutUrl}")
    private String casLogoutUrl;

    @Autowired
    private AdminController(UserService userService, CapSizeService capSizeService, CeremonyService ceremonyService,
                            DegreeService degreeService, DepartmentService departmentService, StateService stateService, AuthService authService, RoleService roleService){
        this._userService = userService;
        this._capSizeService = capSizeService;
        this._ceremonyService = ceremonyService;
        this._degreeService = degreeService;
        this._departmentService = departmentService;
        this._stateService = stateService;
        this._authService = authService;
        this._roleService = roleService;
    }

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
        model.addAttribute("activeUsers", activeUsers);



        //Get Modal Data
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

        List<Role> roles = _roleService.listAll();
        model.addAttribute("roles", roles);


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

        // Restore user to active users table
        model.addAttribute("restore", "/restore/12345678");

        //TODO add logic for only grabbing active users
        List<User> inactiveUsers = _userService.listAll("disabled");

        //User Data
        model.addAttribute("inactiveUsers",inactiveUsers);

        return "admin/admin_page_archived_users";
    }

    //Export Users to CSV
    @GetMapping("/admin_page_active_users/export")
    public void exportToCSV(HttpServletResponse response) throws IOException{
        response.setContentType("text/csv");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=regalia_order_report_" + currentDateTime + ".csv";
        response.setHeader(headerKey, headerValue);

        //Get all users
        List<User> listUsers = _userService.listAll("enabled");

        //Create Dto for user data
        List<UserDto> listOfUserForCSV = new ArrayList<UserDto>();

        //Map Users to UserDto
        for(User user : listUsers){
            listOfUserForCSV.add(new UserDto(
                    user.getEmail(),
                    user.getUsername(),
                    user.getFirst_name(),
                    user.getLast_name(),
                    user.getPhone_number(),
                    user.getCeremony_date().getName(),
                    user.getCap_size().getFitted(),
                    user.getDegree().getName(),
                    user.getDepartment().getName(),
                    user.getHeight_inches(),
                    user.getWeight(),
                    user.getGranting_institution(),
                    user.getGranting_city(),
                    user.getGranting_state().getName(),
                    user.getLast_updated(),
                    user.getRoles()
            ));
        }

        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

        String[] csvHeader = {"CWID", "Last Name", "First Name", "Degree", "School", "Height", "Hat Size", "Last Updated"};
        String[] nameMapping = {"username", "last_name", "first_name", "degree", "granting_institution", "height_inches", "cap_size", "last_updated"};


        csvWriter.writeHeader(csvHeader);
        for(UserDto user : listOfUserForCSV){
            csvWriter.write(user, nameMapping);
        }

        csvWriter.close();
    }
}
