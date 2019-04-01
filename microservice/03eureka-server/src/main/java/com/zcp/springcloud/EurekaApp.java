package com.zcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zcp
 * @create 2019/4/1
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer  //将当前项目标记为eurekaserver
public class EurekaApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaApp.class,args);
    }
}

