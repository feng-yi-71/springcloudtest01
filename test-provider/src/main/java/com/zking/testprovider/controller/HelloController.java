package com.zking.testprovider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @PostMapping("/sayHello")
    public Object sayHello(String name){

//        System.out.println("---- provider sayHello ----");
//        Map<String,Object> map=new HashMap<>();
//        map.put("code",1);
//        map.put("msg","操作成功");
//
//        return map;

        throw new RuntimeException("模拟服务提供者发生熔断....");

    }

}
