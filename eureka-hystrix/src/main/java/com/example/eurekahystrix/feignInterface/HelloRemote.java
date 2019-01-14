package com.example.eurekahystrix.feignInterface;

import com.example.eurekahystrix.controller.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 */
@FeignClient(name = "spring-cloud-product" ,fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    /**
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
