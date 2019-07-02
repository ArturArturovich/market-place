package com.geekbrains.project.service;


import com.geekbrains.project.service.model.SystemUser;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {

    SystemUser findById(Long id);

    SystemUser findByUserName(String username);

    boolean save(SystemUser systemUser);

    void delete(Long id);

    List<SystemUser> findAll();

}
