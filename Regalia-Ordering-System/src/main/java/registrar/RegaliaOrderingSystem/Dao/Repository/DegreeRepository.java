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
import registrar.RegaliaOrderingSystem.Models.Degree;
import registrar.RegaliaOrderingSystem.Models.Role;

public interface DegreeRepository extends JpaRepository<Degree, Long> {

    @Query("SELECT d FROM Degree d WHERE d.name = :name")
    Degree getDegreeByName(@Param("name") String name);
}
