package com.rj.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {
    /**
     * error这个方法有两个，所以后面必须将原始路径覆盖掉
     */
    @RequestMapping("/error")
    public String error() {
        return "这不是一个错误页面，这是一个不正确的页面 ";
    }

    /**
     * 提示我们要覆盖哪个自带的错误地址
     */
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
