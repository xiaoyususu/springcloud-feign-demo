package com.springcloud.feign.controller;

import com.springcloud.feign.User;
import com.springcloud.feign.service.FeignService;
import com.springcloud.feign.service.SegregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author boy
 * @Date 2020/1/27 3:21 PM
 */
@RestController
public class ConsumerController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/consumer")
    public String helloConsumer(){
        String s = feignService.hello();
        System.out.println("----" + s);
        return s;
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2(){
        String result1 = feignService.hello("boy");
        String result2 = feignService.hello("boy", 30).toString();
        String result3 = feignService.hello(new User("boy", 30));
        return result1 + "-----" + result2 + "----" + result3;
    }

}
