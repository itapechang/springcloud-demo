package com.zcp.springcloud.consumer.feign;

import com.zcp.springcloud.FeignClient01Config;
import com.zcp.springcloud.consumer.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author zcp
 * @create 2019/4/4
 * @since 1.0.0
 */
@FeignClient(value = "04provider-eureka",configuration = FeignClient01Config.class)//feignclient01到注册中心找04provider-eureka服务，然后调用接口里的方法
public interface FeignClient01 {
    //参数转到地址里
   // @GetMapping("/user/{id}") //在controller里面的属性名字和rest风格参数名一样时候，pathvariable里面可以省略，但在此处不可以
    //User getUserById(@PathVariable("id") Long id);
    @RequestLine("GET /user/{id}")  //因为我们现在设置的契约模式是feign的默认，就不再支持springmvc的注解，所以改为requestline
    User getUserById(@Param("id") Long id);//注意这个参数的注解需要换回feign中的注解

    //@GetMapping("/user/save")  //参数是复杂对象时候,不管是不是get请求都会以post的方式发出，报错与否取决于提供者的请求方式
    //String save(User user);

    @RequestLine("POST /user/save")
    String save(User user);
}

