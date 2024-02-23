package com.sprintbootmysql.mysqllearn.controller;


import com.sprintbootmysql.mysqllearn.entity.Student;
import com.sprintbootmysql.mysqllearn.service.StudentRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    private StudentRepoService studentRepoService;


    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){

        return studentRepoService.saveDetails(student);

    }
}
