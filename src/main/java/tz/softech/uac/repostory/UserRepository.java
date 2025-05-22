package tz.softech.uac.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import tz.softech.uac.model.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User , Integer> {

    Optional<User> findByUsername(String username);

}
