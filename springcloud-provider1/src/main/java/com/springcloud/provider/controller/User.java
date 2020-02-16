package com.springcloud.provider.controller;

/**
 * @ClassName User
 * @Description TODO
 * @Author boy
 * @Date 2020/1/27 3:17 PM
 */

import lombok.Data;

/**
 * Created by cong 2017/12/2.
 */
@Data
public class User {

    private String name;
    private Integer age;

    public User(){

    }
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
