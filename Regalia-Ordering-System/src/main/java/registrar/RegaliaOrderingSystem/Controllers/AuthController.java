package registrar.RegaliaOrderingSystem.Controllers;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.boot.configuration.CasClientConfigurer;
import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.jasig.cas.client.util.CommonUtils;
import org.jasig.cas.client.util.XmlUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@EnableCasClient
public class AuthController implements CasClientConfigurer {

    @Value("${casLogoutUrl}")
    private String casLogoutUrl;

    public String getCasLogoutUrl(){
        return casLogoutUrl;
    }

    @RequestMapping("/")
    public String casTest(Model model){
        String logoutUrl = getCasLogoutUrl();
        model.addAttribute("logout", logoutUrl);
       return "user/dev_landing_page";
    }

    @RequestMapping("/protected")
    public String protectedTest(HttpServletRequest request, Model model){
        //Get Cas principal
        String principal = request.getUserPrincipal().getName();

        //Get user CWID from principal
        String CWID = principal.substring(0,7);
        model.addAttribute("CWID", CWID);

        String logoutUrl = getCasLogoutUrl();
        model.addAttribute("logout", logoutUrl);

        return "user/protected";
    }

    public String getUserCWID(HttpServletRequest request){
        //Get Cas principal
        String principal = request.getUserPrincipal().getName();

        //Get user CWID from principal
        String CWID = principal.substring(0,7);

        //Return user CWID
        return CWID;
    }


    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        validationFilter.getInitParameters().put("millisBetweenCleanUps", "120000");
    }
}
