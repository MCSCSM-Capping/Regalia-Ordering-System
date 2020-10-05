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
