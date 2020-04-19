package com.zking.testconsumer.service.impl;

import com.zking.testconsumer.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class IHelloServiceImpl implements IHelloService {

    @Resource
    RestTemplate restTemplate;

    @Override
    public Map<String, Object> sayHello() {

        Map<String,Object> rv=restTemplate
                .getForEntity("http://test-provider/sayHello",
                        HashMap.class).getBody();

        for (Map.Entry entry : rv.entrySet()) {
            System.out.println(entry.getKey()+"："+entry.getValue());
        }

        return rv;
    }
}
