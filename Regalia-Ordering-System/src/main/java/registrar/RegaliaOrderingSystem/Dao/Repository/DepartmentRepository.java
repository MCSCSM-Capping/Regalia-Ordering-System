/**
 * JpaRepository Manages Data Access to Corresponding Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */

package registrar.RegaliaOrderingSystem.Dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import registrar.RegaliaOrderingSystem.Models.Department;
import registrar.RegaliaOrderingSystem.Models.Role;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d FROM Department d WHERE d.name = :name")
    Department getDepartmentByName(@Param("name") String name);
}
