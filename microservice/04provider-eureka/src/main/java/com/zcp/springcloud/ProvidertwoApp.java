package com.zcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zcp
 * @create 2019/4/1
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProvidertwoApp {
    public static void main(String[] args){
        SpringApplication.run(ProvidertwoApp.class,args);
    }

}

