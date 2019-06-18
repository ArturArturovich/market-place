package com.geekbrains.project.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.geekbrains.project.service.model.SystemUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService extends UserDetailsService {
    SystemUser findById(Long id);

    SystemUser findByUserName(String username);

    boolean save(SystemUser systemUser);

    List<SystemUser> findAll();

}
