package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhang.suxing
 * @date 2020/5/8 21:08
 **/
@Configuration
public class ApplicationContextConfig {

    /**
     * 实现负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate buildRestTemplate() {
        return new RestTemplate();
    }
}
