package com.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SegregationService
 * @Description TODO
 * @Author boy
 * @Date 2020/2/15 8:43 PM
 */
@FeignClient(value = "hello-segregation")
public interface SegregationService {
    //服务中方法的映射路径
    @RequestMapping("/segregation")
    String hello();
}
