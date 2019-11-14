package com.rj.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class ZuulFilter01 extends ZuulFilter {

    /**
     * 前置pre、后置post、出错 三种类型情况
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 相同的filter可能会有很多个，优先级问题，值越小，优先级越高
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否开启该过滤器
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 拦截的时候具体要做什么？
     * @return 没有任何意义
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //静态的map 所有的类都可以共享
        //map的key如果区分了线程,额外实现了不同线程不再访问同一份数据
        //map.get(key) key 每个线程唯一且不能相互持有,则可以保证线程安全,线程对象本身作为key则可以保证线程独有Thread.currentThread();
        RequestContext context = RequestContext.getCurrentContext(); //ThreadLocal,内部是一个静态的map
        context.getResponse().setContentType("text/html;charset=utf-8");
        context.setResponseBody("zuulFilter01执行了");

//        try {
//            //获取HttpServletResponse,这样可以重定向
//            context.getResponse().sendRedirect("http://www.baidu.com");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //false表示拦截请求，不再往下执行
        //这里的setSendZuulResponse是全局设置，需要其他过滤器可以直接获取这个false，设置为不启用才能真正达到拦截的目的
        //所以，可以这样使用，如果该请求不达标，我们可以通过if判断对全局进行设置，然后其他地方调取即可
        context.setSendZuulResponse(false);
        return null;
    }
}
