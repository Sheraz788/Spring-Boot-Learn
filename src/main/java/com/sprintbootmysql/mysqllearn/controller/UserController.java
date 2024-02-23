package com.sprintbootmysql.mysqllearn.controller;


import com.sprintbootmysql.mysqllearn.entity.User;
import com.sprintbootmysql.mysqllearn.repository.UserRepository;
import com.sprintbootmysql.mysqllearn.service.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepoService userRepoService;

    @GetMapping("/all")
    List<User> getAllUsers(){
        return userRepoService.getAllUsers();
    }

    @PostMapping("/createuser")
    User createUser(@RequestBody User user){

        return userRepository.save(user);
    }

}
