package com.yuanian.Demo_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("-------------0000000000000000");
        return "hello world~~~~~";
    }
}
