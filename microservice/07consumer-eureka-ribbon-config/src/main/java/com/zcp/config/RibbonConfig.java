package com.zcp.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zcp
 * @create 2019/4/3
 * @since 1.0.0
 */
@Configuration
public class RibbonConfig {
    //ribbon的规则
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}

