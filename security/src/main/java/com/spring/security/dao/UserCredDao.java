package com.spring.security.dao;


import com.spring.security.Entity.UserCred;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredDao extends JpaRepository<UserCred, Integer> {

    Optional<UserCred> findByUsername(String username);
}
