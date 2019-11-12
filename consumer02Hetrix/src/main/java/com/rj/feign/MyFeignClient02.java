package com.rj.feign;

import com.rj.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//fallback指定的类必须实现当前接口,并且重写所有的方法,当我们的feign调用这些方式出错的的时候会直接找实现类里面的实现方法
@FeignClient(value = "provider01", fallback = FeignClient02FallBack.class)
public interface MyFeignClient02 {
    @RequestMapping("/provider/users/{id}")
    User findById(@PathVariable("id") Integer id);
}
