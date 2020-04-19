package com.zking.testconsumerfeign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FeignTestServiceFallback implements IFeignTestService {


    @Override
    public Map<String, Object> sayHello(String name) {

        Map<String,Object> map = new HashMap<>();
        map.put("code",2);
        map.put("msg","服务提供者 name=" + name);

        return map;
    }
}
