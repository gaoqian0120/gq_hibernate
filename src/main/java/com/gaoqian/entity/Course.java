package com.gaoqian.entity;

import lombok.Data;

import java.util.Set;

@Data
public class Course {
    private Integer id;
    private String name;
    private Set<Account> accounts;
}
