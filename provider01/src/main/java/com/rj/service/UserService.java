package com.rj.service;

import com.rj.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findByid(Integer id);
}
