package com.fpt.yourcv.repository;

import com.fpt.yourcv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // select * users where username = "" and password = ""
    List<User> findByUsernameAndPassword(String username, String password);
}
