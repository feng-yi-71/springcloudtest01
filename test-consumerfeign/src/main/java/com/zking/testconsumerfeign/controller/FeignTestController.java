package com.zking.testconsumerfeign.controller;

import com.zking.testconsumerfeign.service.IFeignTestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class FeignTestController {

    @Resource
    private IFeignTestService feignTestService;

    @PostMapping("/sayHello")
    public Map<String,Object> sayHello(String name){

        System.out.println("feign 调用服务提供者提供的服务");
        Map<String,Object> map=feignTestService.sayHello(name);

        return map;
    }

}
