package net.remoteunited.SecurityRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.remoteunited.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
