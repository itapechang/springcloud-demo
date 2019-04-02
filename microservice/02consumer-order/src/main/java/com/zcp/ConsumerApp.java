package com.zcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApp {

    @Bean
    public RestTemplate getTemp(){
        return new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(ConsumerApp.class,args);
    }
}

