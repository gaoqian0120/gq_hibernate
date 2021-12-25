package com.gaoqian.entity;

import lombok.Data;

import java.util.Set;

@Data
public class Account {
    private Integer id;
    private String name;
    private Set<Course> courses;
}
