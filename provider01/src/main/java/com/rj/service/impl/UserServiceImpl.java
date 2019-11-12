package com.rj.service.impl;

import com.rj.dao.UserDao;
import com.rj.pojo.User;
import com.rj.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
@MapperScan("com.rj.dao")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findByid(Integer id) {
        return userDao.findByid(id);
    }
}
