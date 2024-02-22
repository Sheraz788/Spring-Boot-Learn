package com.sprintbootmysql.mysqllearn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/createuser")
    User createUser(@RequestBody User user){

        return userRepository.save(user);
    }

}
