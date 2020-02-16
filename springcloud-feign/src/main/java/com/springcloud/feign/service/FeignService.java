package com.springcloud.feign.service;
import com.springcloud.feign.service.impl.FeignFallBack;
import com.springcloud.feign.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
/**
 * @ClassName FeignService
 * @Description TODO
 * @Author boy
 * @Date 2020/1/27 3:20 PM
 */

@FeignClient(value = "hello-service",fallback = FeignFallBack.class)
public interface FeignService {
    //服务中方法的映射路径
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
