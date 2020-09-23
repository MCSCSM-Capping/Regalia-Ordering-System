package registrar.RegaliaOrderingSystem.Dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registrar.RegaliaOrderingSystem.Models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
