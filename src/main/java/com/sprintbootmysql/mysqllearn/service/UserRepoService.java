package com.sprintbootmysql.mysqllearn.service;


import com.sprintbootmysql.mysqllearn.entity.User;
import com.sprintbootmysql.mysqllearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepoService {


    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers(){

        return userRepository.findAll();

    }

    public User saveUserInfo(User user){

        return userRepository.save(user);

    }

    public void deleteById(Long id){

        userRepository.deleteById(id);

    }


    public void updateUserName(Long id, String userName){

        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with this Id not found"));

        user.setName(userName);

        userRepository.save(user);
    }
}
