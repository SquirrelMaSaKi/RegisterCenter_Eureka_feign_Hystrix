package com.rj.feign;

import com.rj.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider01", fallbackFactory = Feign03FallBackFactory.class)
public interface MyFeignClient03 {
    @RequestMapping("/provider/users/{id}")
    User findById(@PathVariable("id") Integer id);
}
