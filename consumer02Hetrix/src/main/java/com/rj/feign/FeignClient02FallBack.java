package com.rj.feign;

import com.rj.pojo.User;
import org.springframework.stereotype.Component;

@Component //必须添加这个注解,否则无法创建这个对象,就无法给feign客户端注入这个对象
public class FeignClient02FallBack implements MyFeignClient02 {

    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setId(-200);
        user.setUsername("有问题");
        return user;
    }
}
