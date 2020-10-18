/**
 * This Class Manages Rest Calls to From the CustomErrorController.
 * All Required dependencies are declared at the top of the page
 *
 * The Annotation @Autowired allows for dependency injection of the specified service.
 * The Annotation @RequestMapping("") will set the http header address of the given route
 *
 *
 * @version 1.0
 * @author Steven Buglione
 *
 */


package registrar.RegaliaOrderingSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    //Error handling routes
    @RequestMapping("/403")
    public String viewError403(){
        return "error/403";
    }

    @RequestMapping("/404")
    public String viewError404(){
        return "error/404";
    }

    @RequestMapping("/500")
    public String viewError500(){
        return "error/500";
    }
}
