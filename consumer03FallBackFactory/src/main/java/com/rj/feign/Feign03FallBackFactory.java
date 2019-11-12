package com.rj.feign;

import com.rj.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class Feign03FallBackFactory implements FallbackFactory<MyFeignClient03> {
    @Override
    public MyFeignClient03 create(Throwable cause) {
        return new MyFeignClient03() {
            @Override
            public User findById(Integer id) {
                User user = new User();
                user.setId(-200);
                user.setUsername("有问题需要解决");
                return user;
            }
        };
    }
}
