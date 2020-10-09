package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class AuthService {


    public Boolean isAuth(HttpServletRequest request){
        return Objects.nonNull(request.getUserPrincipal());
    }

    public String getUserCWID(HttpServletRequest request){
        String user = request.getUserPrincipal().getName();
        String CWID = user.substring(0,7);
        return CWID;
    }
}
