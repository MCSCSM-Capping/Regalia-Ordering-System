package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.RoleRepository;
import registrar.RegaliaOrderingSystem.Models.Role;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository _roleRepository;

    public List<Role> listAll(){
        return _roleRepository.findAll();
    }

    public void save(Role role){
        _roleRepository.save(role);
    }

    public Role get(Long id){
        return _roleRepository.findById(id).get();
    }

    public void delete(Long id){
        _roleRepository.deleteById(id);
    }
}
