package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.CapSizeRepository;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserDataRepository;
import registrar.RegaliaOrderingSystem.Dao.Repository.UserRepository;
import registrar.RegaliaOrderingSystem.Models.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDataRepository _userDataRepository;

    public List<User> listAll(){
        return _userDataRepository.findAll();
    }

    public void save(User user){
        _userDataRepository.save(user);
    }

    public User get(Long id){
        return _userDataRepository.findById(id).get();
    }

    public void delete(Long id){
        _userDataRepository.deleteById(id);
    }

}
