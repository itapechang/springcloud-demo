package com.zcp.springcloud;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zcp
 * @create 2019/4/4
 * @since 1.0.0
 */
@Configuration
public class FeignClient01Config {

    @Bean
    public Contract contract(){
        return new feign.Contract.Default();  //修改feign的契约为默认，是feign的默认（feign的依赖包的规定），不是springcloud包装后springmvc默认的，feign和springcloud是独立的
    }

}

