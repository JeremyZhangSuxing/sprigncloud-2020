package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhang.suxing
 * @date 2020/4/25 14:19
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9002.class);
    }
}
