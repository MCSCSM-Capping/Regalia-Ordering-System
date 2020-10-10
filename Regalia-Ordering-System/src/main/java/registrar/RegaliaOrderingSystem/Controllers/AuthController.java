package registrar.RegaliaOrderingSystem.Controllers;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.boot.configuration.CasClientConfigurer;
import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.jasig.cas.client.util.CommonUtils;
import org.jasig.cas.client.util.XmlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import registrar.RegaliaOrderingSystem.Dao.Service.AuthService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@EnableCasClient
public class AuthController implements CasClientConfigurer {

    @Autowired
    private AuthService _authService;

    @Value("${casLogoutUrl}")
    private String casLogoutUrl;

    public String getCasLogoutUrl(){
        return casLogoutUrl;
    }

    @RequestMapping("/")
    public String casTest(HttpServletRequest request, Model model){
        String logoutUrl = getCasLogoutUrl();
        model.addAttribute("logout", logoutUrl);
        System.out.print(_authService.isAuth(request));
       return "user/dev_landing_page";
    }

    @RequestMapping("/protected")
    public String protectedTest(HttpServletRequest request, Model model){

        //Get user CWID from principal
        String CWID = _authService.getUserCWID(request);
        model.addAttribute("CWID", CWID);


        String logoutUrl = getCasLogoutUrl();
        model.addAttribute("logout", logoutUrl);
        System.out.print(_authService.isAuth(request));

        return "user/protected";
    }




    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        validationFilter.getInitParameters().put("millisBetweenCleanUps", "120000");
    }
}
