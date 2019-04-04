package com.zcp.springcloud.feign;

import com.zcp.springcloud.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author zcp
 * @create 2019/4/4
 * @since 1.0.0
 */
@FeignClient("04provider-eureka")//feignclient01到注册中心找04provider-eureka服务，然后调用接口里的方法
public interface FeignClient01 {
    //参数转到地址里
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Long id);  //在controller里面的属性名字和rest风格参数名一样时候，pathvariable里面可以省略，但在此处不可以

    @GetMapping("/user/save")  //参数是复杂对象时候,不管是不是get请求都会以post的方式发出，报错与否取决于提供者的请求方式
    String save(User user);
}

