package com.zcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import sun.applet.Main;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient  //启用eureka客户端
public class ProviderApp {

    public static void main(String[] args){
        SpringApplication.run(ProviderApp.class,args);
    }
}

