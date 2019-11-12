package com.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//开启服务发现,根据你的导入的依赖包自动决定使用的是EnableEurekaClient还是其他的
@EnableFeignClients//开启对feign的支持,帮我们初始化所有被FeignClient注解修饰的接口
public class Consumer01FeignStartApp {
    public static void main(String[] args) {
        SpringApplication.run(Consumer01FeignStartApp.class, args);
    }
}
