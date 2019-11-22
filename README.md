# RegisterCenter_Eureka_feign_Hystrix
注册中心初步：Eureka+feign+hystrix
服务端向注册中心放置相关的服务，然后客户端也需要向注册中心注册，但是可以调用服务端给予的相关服务
注册中心是zookeeper+Dubbo
后来是Eureka整合，成为主要注册中心使用
Feign整合了负载均衡配置ribbon，这样，在客户端根本不需要实现类，直接冲注册中心向对应的服务端获取实现类
hystrix的主要作用是服务降级
当正常的路径访问时，由于服务端对应的服务出现故障，导致异常，则会降级到FallBackFactory或者config函数中，执行该函数的方法
hystrix就是一个熔断的机制

zuul网关设置，相当于是在整个的注册中心再加上一层网关控制，用户通过网关访问并调取注册中心中的服务

当服务不存在，网关还可以进行配置，进行跳转处理错误页面；此外还能进行过滤和拦截处理


<<<<<<< HEAD
# 此外，还有消息队列RabbitMQ
详见mqSender中md文档
=======
当服务不存在，网关还可以进行配置，进行跳转处理错误页面；此外还能进行过滤和拦截处理
>>>>>>> registercentral/master
