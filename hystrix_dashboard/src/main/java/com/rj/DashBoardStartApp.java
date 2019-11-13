package com.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //发现监控面板服务，通过地址访问，可视化的工具，进行熔断机制的监控
public class DashBoardStartApp {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardStartApp.class, args);
    }
}
