package com.zcp.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zcp.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate; //spring提供的用于访问rest接口的模板
//
//    private String url="http://127.0.0.1:8081/user/";
//    @Autowired
//    private EurekaClient eurekaClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/info/{id}")
    public User getUser(@PathVariable("id") Long id){
        //访问提供者获取数据
        //User user = restTemplate.getForObject(url + id, User.class);  //通过访问rest获取到json数据，然后转换成User对象

//        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);//从eureka上获取指定服务的信息
//        String url = instanceInfo.getHomePageUrl();
//        System.out.println("服务提供者的地址"+url);
        User user = restTemplate.getForObject( "http://04provider-eureka/user/"+ id, User.class);
        return user;
    }

    @PostMapping("/save")
    public String addUser(@RequestBody User user){
        String result=restTemplate.postForObject("http://04provider-eureka/user/save/",user,String.class);
        return result;
    }

    @GetMapping("/test")
    public String test(){

        int port=loadBalancerClient.choose("04provider-eureka").getPort();
        System.out.println("当前请求的是=====>"+port);
        return port+"";
    }
}

