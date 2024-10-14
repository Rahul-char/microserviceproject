package com.spring.security.Service;

import com.spring.security.Entity.CustomUserDetails;
import com.spring.security.Entity.UserCred;
import com.spring.security.dao.UserCredDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserCredDao userCredDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<UserCred> credential = userCredDao.findByUsername(username);
        return credential.map(CustomUserDetails::new).orElseThrow(() -> new RuntimeException("user not found"));
    }
}
