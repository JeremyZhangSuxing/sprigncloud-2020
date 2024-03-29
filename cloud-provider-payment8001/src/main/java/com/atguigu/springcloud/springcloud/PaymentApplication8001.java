package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhang.suxing
 * @date 2020/4/25 14:19
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class);
    }
}
