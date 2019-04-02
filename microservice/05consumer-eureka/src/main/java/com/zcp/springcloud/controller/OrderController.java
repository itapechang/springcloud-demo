package com.zcp.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zcp.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
    @Autowired
    private EurekaClient eurekaClient;


    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable("id") Long id){
        //访问提供者获取数据
        //User user = restTemplate.getForObject(url + id, User.class);  //通过访问rest获取到json数据，然后转换成User对象

        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);//从eureka上获取指定服务的信息
        String url = instanceInfo.getHomePageUrl();
        System.out.println("服务提供者的地址"+url);
        User user = restTemplate.getForObject(url +"/user/"+ id, User.class);
        return user;
    }
}

