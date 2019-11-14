package com.rj.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public String error() {
        return "这不是一个错误页面，这是一个不正确的页面 ";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
