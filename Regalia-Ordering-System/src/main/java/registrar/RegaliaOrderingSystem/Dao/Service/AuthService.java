/**
 * AuthService provides an easy way to get the logged in users CWID
 * @version 1.0
 * @author Steven Buglione
 *
 */


package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class AuthService {


    public String getUserCWID(HttpServletRequest request){
        String user = request.getUserPrincipal().getName();
        String CWID = user.substring(0,8);
        return CWID;
    }
}
