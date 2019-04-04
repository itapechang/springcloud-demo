package com.zcp.springcloud.consumer.controller;

import com.zcp.springcloud.feign.FeignClient01;
import com.zcp.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@RestController
public class OrderController {

    @Autowired
    private FeignClient01 feignClient01;//spring会自动创建，因为有feignclient注解，会创建一个代理对象

    //地址转到参数里
    @GetMapping("/info/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return feignClient01.getUserById(id);
    }

//    @PostMapping("/save")
//    public String addUser(@RequestBody User user) {
//
//    }
    @PostMapping("/save")
    public String addUser(@RequestBody User user){
        return feignClient01.save(user);
    }

}

