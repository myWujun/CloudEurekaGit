package com.example.hystrixdashboardturbinenode2.controller;

import com.example.hystrixdashboardturbinenode2.feignInterface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.hello(name);
    }
}
