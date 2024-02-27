package com.sprintbootmysql.mysqllearn.repository;

import com.sprintbootmysql.mysqllearn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    void deleteById(Long id);

    User findByUsername(String username);

}
