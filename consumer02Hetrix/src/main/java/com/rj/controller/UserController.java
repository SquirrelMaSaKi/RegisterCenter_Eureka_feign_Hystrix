package com.rj.controller;

import com.rj.feign.MyFeignClient02;
import com.rj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer02")
public class UserController {
    @Autowired
    private MyFeignClient02 myFeignClient02;

    @RequestMapping("/users/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return myFeignClient02.findById(id);
    }
}
