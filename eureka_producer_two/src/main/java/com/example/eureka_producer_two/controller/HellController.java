package com.example.eureka_producer_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class HellController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello "+name+"，this is producer2 messge";
    }
}
