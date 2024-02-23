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

}
