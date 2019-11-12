package com.rj.controller;

import com.rj.feign.MyFeignClient03;
import com.rj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer03")
public class Consumer03FallBackFactoryController {
    @Autowired
    private MyFeignClient03 myFeignClient03;
    @RequestMapping("/users/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return myFeignClient03.findById(id);
    }
}
