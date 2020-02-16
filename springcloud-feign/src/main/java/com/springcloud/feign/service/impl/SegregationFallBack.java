package com.springcloud.feign.service.impl;

import com.springcloud.feign.service.SegregationService;
import org.springframework.stereotype.Component;

/**
 * @ClassName SegregationFallBack
 * @Description TODO
 * @Author boy
 * @Date 2020/2/15 8:58 PM
 */
@Component
public class SegregationFallBack implements SegregationService {
    @Override
    public String hello() {
        return "error";
    }
}
