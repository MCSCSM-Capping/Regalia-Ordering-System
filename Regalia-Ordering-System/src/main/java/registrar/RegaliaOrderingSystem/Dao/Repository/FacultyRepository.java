package registrar.RegaliaOrderingSystem.Dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registrar.RegaliaOrderingSystem.Models.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
