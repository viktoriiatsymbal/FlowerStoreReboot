package ua.edu.ucu.apps.flowerstore.user;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT user FROM AppUser user WHERE user.email = ?1")
    Optional<AppUser> findByEmail(String email);
}
