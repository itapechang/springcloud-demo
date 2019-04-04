package com.zcp.springcloud.consumer.feign;

import com.zcp.springcloud.FeignClient02Config;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zcp
 * @create 2019/4/4
 * @since 1.0.0
 */
@FeignClient(name = "adassdad",url = "http://localhost:9000",configuration = FeignClient02Config.class)
public interface FeignClient02 {

    @GetMapping("/eureka/apps/{serviceid}")
    String getServiceinfoById(@PathVariable("serviceid")String serviceid);
}

