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
import registrar.RegaliaOrderingSystem.Models.Ceremony;
import registrar.RegaliaOrderingSystem.Models.Role;

public interface CeremonyRepository extends JpaRepository<Ceremony, Long> {

    @Query("SELECT c FROM Ceremony c WHERE c.name = :name")
    Ceremony getCeremonyByName(@Param("name") String name);
}
