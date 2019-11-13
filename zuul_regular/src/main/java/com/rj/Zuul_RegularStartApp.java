package com.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Zuul_RegularStartApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_RegularStartApp.class, args);
    }

    /**
     * 按照特定规则对服务命名后可以通过特定规则快速访问
     * 比如 服务名字叫 users-v2 可以通过/v2/users来访问,这样可以实现版本化控制
     * 可以版本话控制
     */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
}
