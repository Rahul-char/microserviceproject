package com.spring.security.Controller;

import com.spring.security.Entity.UserCred;
import com.spring.security.Service.UserCredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userCred")
public class UserCredController {

    @Autowired
    private UserCredService userCredService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/addCredentials")
    public ResponseEntity<UserCred> addCredentials(@RequestBody UserCred u){
        return new ResponseEntity<>(userCredService.addUser(u), HttpStatus.CREATED);
    }

    @PostMapping("/validate/user")
    public String getToken(@RequestBody UserCred userCred){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userCred.getUsername(), userCred.getPassword()));
        if(authentication.isAuthenticated()){
            return "userCredService.generateToken(userCred.getUsername())";
        }return null;
    }
}
