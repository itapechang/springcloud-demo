package com.zcp.springcloud;

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
@ABC //此注解没有意义，给compentScan作判断用的，被该注解标记的类不会被扫描到（谁配了它就起作用，相当于局部配置）
public class RibbonConfig {
    //ribbon的规则

    //当有多个规则时候，RibbonConfig会有多个，如果和启动器器放在同一层级（建议放到不被compentScan或者springbootapplication扫描到的位置）
    //原因是一旦同一层级被扫描到就变成了全局规则
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}

