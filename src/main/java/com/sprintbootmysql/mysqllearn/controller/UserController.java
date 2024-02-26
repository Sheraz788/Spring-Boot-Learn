package com.sprintbootmysql.mysqllearn.controller;


import com.sprintbootmysql.mysqllearn.entity.User;
import com.sprintbootmysql.mysqllearn.service.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

        return userRepoService.saveUserInfo(user);

    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteUserById(@PathVariable Long id){
        userRepoService.deleteById(id);

        return ResponseEntity.ok("Entity with ID " + id + " deleted successfully.");
    }

    @PutMapping("/update-name")
    ResponseEntity<String> updateUserName(@RequestParam Long id, @RequestParam String userName){
        userRepoService.updateUserName(id, userName);
        return ResponseEntity.ok("User with Id " + id + " has been updated with a new name " + userName);
    }
}