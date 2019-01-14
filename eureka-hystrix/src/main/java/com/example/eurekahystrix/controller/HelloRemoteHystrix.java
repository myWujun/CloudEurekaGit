package com.example.eurekahystrix.controller;

import com.example.eurekahystrix.feignInterface.HelloRemote;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "this Hystrix" + name;
    }
}
