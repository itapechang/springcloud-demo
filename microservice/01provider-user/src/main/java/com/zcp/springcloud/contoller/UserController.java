package com.zcp.springcloud.contoller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zcp.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){
        return new User(id);
    }

    @GetMapping("/eurekainfo")
    public String info(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        return instanceInfo.getHomePageUrl();
    }
}

