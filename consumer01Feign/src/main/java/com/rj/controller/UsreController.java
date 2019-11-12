package com.rj.controller;

import com.rj.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UsreController {
    @Autowired
    private MyFeignClient myFeignClient;

    @RequestMapping("/users/{id}")
    public String findById(@PathVariable("id") Integer id) {
        return "消费者："+ myFeignClient.findById(id).toString();
    }
}
