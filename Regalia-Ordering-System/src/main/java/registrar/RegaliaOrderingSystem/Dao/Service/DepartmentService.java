/**
 * Implements JpaRepository to provide a way to manage Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */

package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.DepartmentRepository;
import registrar.RegaliaOrderingSystem.Models.Department;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentRepository _departmentRepository;

    public List<Department> listAll(){
        return _departmentRepository.findAll();
    }

    public void save(Department department){
        _departmentRepository.save(department);
    }

    public Department get(Long id){
        return _departmentRepository.findById(id).get();
    }

    public void delete(Long id){
        _departmentRepository.deleteById(id);
    }

    public Department getDepartmentIdByName(String name){
        Department department = _departmentRepository.getDepartmentByName(name);
        return department;
    }
}
