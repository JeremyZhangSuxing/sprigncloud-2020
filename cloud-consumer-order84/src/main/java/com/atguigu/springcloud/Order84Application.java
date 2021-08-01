package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author suxing.zhang
 * @date 2021/8/1 20:53
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Order84Application {
    public static void main(String[] args) {
        SpringApplication.run(Order84Application.class, args);
    }
}
