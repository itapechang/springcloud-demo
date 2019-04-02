package com.zcp.springcloud.controller;

import com.zcp.springcloud.pojo.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/user/save")
    public String addUser(@RequestBody User user){
        return "lalala";
    }
}

