package com.zcp.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启对feign的支持
public class ConsumerApp {

    public static void main(String[] args){
        SpringApplication.run(ConsumerApp.class,args);
    }
}

