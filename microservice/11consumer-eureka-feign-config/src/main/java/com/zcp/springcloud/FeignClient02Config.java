package com.zcp.springcloud;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zcp
 * @create 2019/4/4
 * @since 1.0.0
 */
@Configuration
public class FeignClient02Config {

    @Bean //配置拦截器
    public BasicAuthRequestInterceptor authRequestInterceptor(){
        return new BasicAuthRequestInterceptor("admin","123");
    }
}

