package com.rj.feign;

import com.rj.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider01")
public interface MyFeignClient {
    //它和我们的controller刚好相反,是当我们调用这个接口中这个方法的时候会请求我们指定的地址,方法的参数会被传递到地址中
    @RequestMapping("/provider/users/{id}")
    User findById(@PathVariable("id") Integer id);
}
