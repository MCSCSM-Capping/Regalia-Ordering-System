/**
 * Implements JpaRepository to provide a way to manage Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */

package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserRepository;
import registrar.RegaliaOrderingSystem.Models.User;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> listAll(){
        return userRepository.findAll();
    }

    public void save(User user){
        //Every Time the user is updated the time updates
        user.setLast_updated(new Date());

        userRepository.save(user);
    }

    public User get(Long id){
        return userRepository.findById(id).get();
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public List<User> listAll(String keyword){
        if(keyword == "enabled"){
            return userRepository.findByEnabled(false);
        }else if(keyword == "disabled"){
            return userRepository.findByEnabled(true);
        }
        return userRepository.findAll();
    }

    public Boolean doesUserExist(String username){
        User user = userRepository.getUserByUsername(username);

        if( Objects.isNull(user)){
            return false;
        }
        return true;

    }

    public User getUserByUsername(String username){
        return userRepository.getUserByUsername(username);
    }


}
