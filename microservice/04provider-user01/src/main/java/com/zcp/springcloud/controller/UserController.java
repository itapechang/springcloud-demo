package com.zcp.springcloud.controller;

import com.zcp.springcloud.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcp
 * @create 2019/4/1
 * @since 1.0.0
 */
@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){
        return new User(id);
    }
}

