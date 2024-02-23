package com.sprintbootmysql.mysqllearn.service;


import com.sprintbootmysql.mysqllearn.entity.Student;
import com.sprintbootmysql.mysqllearn.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRepoService {


    @Autowired
    private StudentRepo studentRepo;


    public Student saveDetails(Student student){

        return studentRepo.save(student);

    }
}
