package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProviderController
 * @Description TODO
 * @Author boy
 * @Date 2019/12/28 6:26 PM
 */
@RestController
public class ProviderController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("访问来1了......");
        return "HelloProvider1";
    }

    //新增的方法
    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "HelloProvider1 " + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return "HelloProvider1 "+ user. getName () + ", " + user. getAge ();
    }

}
