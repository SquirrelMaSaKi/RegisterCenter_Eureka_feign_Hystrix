package com.rj.dao;

import com.rj.pojo.User;

import java.util.List;


public interface UserDao {
    List<User> findAll();

    User findByid(Integer id);
}
