package com.gaoqian.entity;

import lombok.Data;

@Data
public class AA {
    private String a;

    public AA(String s) {
    }

    public AA() {

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
