package com.spring.security.Service;

import com.spring.security.Entity.UserCred;
import com.spring.security.dao.UserCredDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserCredService {

    @Autowired
    private UserCredDao userCredDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserCred addUser(UserCred u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return userCredDao.saveAndFlush(u);
    }
}
