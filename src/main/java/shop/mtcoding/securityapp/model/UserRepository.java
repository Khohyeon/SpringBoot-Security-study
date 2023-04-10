package shop.mtcoding.securityapp.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

//    @Query("select U from User u where u.username = :username")
//    Optional<User> findByUsername(@Param("username") String username);
    Optional<User> findByUsername(String username);
}
