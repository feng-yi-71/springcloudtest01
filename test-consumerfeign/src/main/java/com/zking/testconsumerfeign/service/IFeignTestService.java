package com.zking.testconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "test-provider",fallback = FeignTestServiceFallback.class)
public interface IFeignTestService {

    @RequestMapping(value = "/sayHello",method = RequestMethod.POST)
    Map<String,Object> sayHello(@RequestParam("name") String name);

}
