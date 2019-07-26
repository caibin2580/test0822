package com.yn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("-------------11111111111");
        return "hello world~~~~~0000000";
    }
}
