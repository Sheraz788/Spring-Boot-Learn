package com.sprintbootmysql.mysqllearn.entity;

import jakarta.persistence.*;
//useLombok dependency for future


@Entity
@Table(name = "Student_DB")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;


    @Column(name = "Marks")
    private int mark;


    @Column(name = "StudentNames")
    private String name;


    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }


}
