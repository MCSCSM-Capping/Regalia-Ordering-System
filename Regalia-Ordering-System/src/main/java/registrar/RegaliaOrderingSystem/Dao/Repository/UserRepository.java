/**
 * JpaRepository Manages Data Access to User Entity
 * Custom SQL commands to manage user data
 * @version 1.0
 * @author Steven Buglione
 *
 */





package registrar.RegaliaOrderingSystem.Dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import registrar.RegaliaOrderingSystem.Models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    public User getUserById(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.enabled = :enabled")
    List<User> findByEnabled(@Param("enabled") Boolean enabled);

    @Modifying
    @Query("UPDATE User u SET u.enabled = 1 WHERE u.username= :username")
    public void deleteUser(@Param("username") String username);

    @Modifying
    @Query("UPDATE User u SET u.enabled = 0 WHERE u.username = :username")
    public void restoreUser(@Param("username") String username);

}
