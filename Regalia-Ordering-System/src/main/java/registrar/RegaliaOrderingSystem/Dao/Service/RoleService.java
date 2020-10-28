/**
 * Implements JpaRepository to provide a way to manage Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */

package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.RoleRepository;
import registrar.RegaliaOrderingSystem.Models.Role;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public Role getRoleByName(String role){
        return _roleRepository.getRoleByName(role);
    }

    public void delete(Long id){
        _roleRepository.deleteById(id);
    }


    public Set<Role> listOfUserRole(String role){
        Role userRole = _roleRepository.getRoleByName(role);
        Set<Role> listRoles = new HashSet<Role>();
        listRoles.add(userRole);
        return listRoles;
    }
}
