package com.yn.demo_sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    Service service;

    @RequestMapping("/hello")
    public String index() {
        System.out.println("-------------11111111111");
        return "hello world~~~~~0000000";
    }

    @RequestMapping("/insert")
    public String insert(){
        System.out.println("write........");
        return service.insert();
    }
}
