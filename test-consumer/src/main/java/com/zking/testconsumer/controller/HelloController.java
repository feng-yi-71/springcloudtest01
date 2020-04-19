package com.zking.testconsumer.controller;

import com.zking.testconsumer.service.IHelloService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class HelloController {

    @Resource
    private IHelloService helloService;

    @PostMapping("/sayHello")
    public Object sayHello(){

        System.out.println("调用服务提供者的sayHello方法。。。。");
        Map<String,Object> map=helloService.sayHello();

        return map;

    }

}
