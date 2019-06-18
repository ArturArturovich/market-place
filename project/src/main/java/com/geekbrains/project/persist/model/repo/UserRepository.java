package com.geekbrains.project.persist.model.repo;

import com.geekbrains.project.persist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("from User u join fetch u.roles r where u.userName = :userName")
    User findByUserName(String userName);
}
