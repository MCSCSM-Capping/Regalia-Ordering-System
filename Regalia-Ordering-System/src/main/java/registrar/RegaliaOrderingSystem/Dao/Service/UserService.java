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
import registrar.RegaliaOrderingSystem.Models.Role;
import registrar.RegaliaOrderingSystem.Models.User;

import javax.transaction.Transactional;
import java.util.*;

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

    public User getByUsername(String username) { return userRepository.getUserByUsername(username); }

    public User delete(String username){
//        userRepository.deleteById(id);
        userRepository.deleteUser(username);
        return getUserByUsername(username);
    }

    public void restore(String username){
        userRepository.restoreUser(username);
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

    public User getUserById(Long id) { return userRepository.getUserById(id); }

    public Set<Role> setUserRoles(Role role){

        //Create a new Set to contain the user roles
        Set<Role> userRoles = new HashSet<Role>();

        //Add the role to user roles
        userRoles.add(role);

        //Return the updated User Object
        return userRoles ;
    }

    public void deleteUserById(String username){
        User user = getUserByUsername(username);
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void restoreUserById(String username){
        User user = getUserByUsername(username);
        user.setEnabled(false);
        userRepository.save(user);
    }

    public Boolean doesUserEmailExist(String email){
        User user = userRepository.getUserByEmail(email);

        if(Objects.isNull(user)){
            return false;
        }

        return true;
    }






}
