package com.example.hystrixdashboardturbinenode1.controller;

import com.example.hystrixdashboardturbinenode1.feignInterface.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "this fallback" +name;
    }
}
