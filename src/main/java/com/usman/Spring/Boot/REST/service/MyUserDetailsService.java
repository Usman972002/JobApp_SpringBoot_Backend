package com.usman.Spring.Boot.REST.service;

import com.usman.Spring.Boot.REST.model.User;
import com.usman.Spring.Boot.REST.model.UserPrincipal;
import com.usman.Spring.Boot.REST.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user =  repo.findByUsername(username);
        if(user == null){
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("User Not Found 404");
        }
        return new UserPrincipal(user);
    }
}
