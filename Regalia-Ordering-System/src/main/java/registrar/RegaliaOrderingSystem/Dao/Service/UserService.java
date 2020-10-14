package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.CapSizeRepository;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserDataRepository;
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
    private UserDataRepository _userDataRepository;

    @Autowired
    private UserRepository userRepository;


    public List<User> listAll(){
        return _userDataRepository.findAll();
    }

    public void save(User user){
        //Every Time the user is updated the time updates
        user.setLast_updated(new Date());

        _userDataRepository.save(user);
    }

    public User get(Long id){
        return _userDataRepository.findById(id).get();
    }

    public void delete(Long id){
        _userDataRepository.deleteById(id);
    }

    public List<User> listAll(String keyword){
        if(keyword == "enabled"){
            return _userDataRepository.findByEnabled(false);
        }else if(keyword == "disabled"){
            return _userDataRepository.findByEnabled(true);
        }
        return _userDataRepository.findAll();
    }

    public Boolean doesUserExist(String username){
        User user = userRepository.getUserByUsername(username);

        if( Objects.isNull(user)){
            return false;
        }
        return true;

    }


}
