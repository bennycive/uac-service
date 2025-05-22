package tz.softech.uac.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import tz.softech.uac.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role , Integer> {
    Optional<Role> findByName(String name);

}
