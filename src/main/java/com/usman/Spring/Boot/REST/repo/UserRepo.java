package com.usman.Spring.Boot.REST.repo;


import com.usman.Spring.Boot.REST.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}

