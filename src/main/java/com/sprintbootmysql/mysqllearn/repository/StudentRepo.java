package com.sprintbootmysql.mysqllearn.repository;

import com.sprintbootmysql.mysqllearn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
