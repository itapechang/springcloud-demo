package com.zcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
//给多个服务开启负载均衡@RibbonClients(@RibbonClient("04provider-eureka"),@RibbonClient("04provider-eureka"))
@RibbonClient(value = "04provider-eureka")
public class ConsumerApp {

    @Bean
    @LoadBalanced//给当前对象开启负载均衡，具体是在调用@RibbonClient("04provider-eureka")这个配置设置的服务的时候开启
    public RestTemplate getTemp() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}

