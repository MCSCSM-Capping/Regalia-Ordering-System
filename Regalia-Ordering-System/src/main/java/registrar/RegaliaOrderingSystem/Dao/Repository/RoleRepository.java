package registrar.RegaliaOrderingSystem.Dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registrar.RegaliaOrderingSystem.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
