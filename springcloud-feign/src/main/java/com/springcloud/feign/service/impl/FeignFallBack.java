package com.springcloud.feign.service.impl;

import com.springcloud.feign.User;
import com.springcloud.feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignFallBack
 * @Description TODO
 * @Author boy
 * @Date 2020/1/27 3:23 PM
 */
@Component
public class FeignFallBack implements FeignService {
    //实现的方法是服务调用的降级方法
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
