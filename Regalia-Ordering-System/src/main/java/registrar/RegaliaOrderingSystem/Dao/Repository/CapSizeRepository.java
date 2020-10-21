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
import registrar.RegaliaOrderingSystem.Models.CapSize;
import registrar.RegaliaOrderingSystem.Models.Role;

public interface CapSizeRepository extends JpaRepository<CapSize, Long> {

    @Query("SELECT c FROM CapSize c WHERE c.fitted = :fitted")
    CapSize getCapByFitted(@Param("fitted") String fitted);
}
