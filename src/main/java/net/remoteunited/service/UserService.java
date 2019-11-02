package net.remoteunited.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.remoteunited.model.User;
import net.remoteunited.securitydto.UserRegistrationDto;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
