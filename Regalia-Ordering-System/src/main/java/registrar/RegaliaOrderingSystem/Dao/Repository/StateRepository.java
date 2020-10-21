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
import registrar.RegaliaOrderingSystem.Models.Role;
import registrar.RegaliaOrderingSystem.Models.State;

public interface StateRepository extends JpaRepository<State, Long> {
    @Query("SELECT s FROM State s WHERE s.name = :name")
    State getStateByName(@Param("name") String name);
}
