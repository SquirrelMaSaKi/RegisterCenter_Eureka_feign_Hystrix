package com.rj.controller;

import com.rj.pojo.User;
import com.rj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/provider")
@RestController
public class UserProvider01Controller {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findByid(id);
    }
}
