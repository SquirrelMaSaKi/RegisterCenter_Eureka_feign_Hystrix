异常的处理，就是当服务不存在，使用网关访问的时候，就会出现404错误，如下
> This application has no explicit mapping for /error, so you are seeing this as a fallback.

我们可以自己定义一个回调函数，覆盖error地址
