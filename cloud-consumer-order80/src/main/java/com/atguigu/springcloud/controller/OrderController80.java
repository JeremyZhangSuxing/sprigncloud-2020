package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhang.suxing
 * @date 2020/5/8 21:05
 **/
@RestController
@Slf4j
public class OrderController80 {
    //    private static final String PAYMENT_URL = "http://localhost:8001";
    /**
     * 服务name直接调用
     */
    private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment")
    public ResponseEntity createPayment(@RequestBody Payment payment) {
        return ResponseEntity.ok(restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class));
    }

    @GetMapping("/consumer/payment/{id}")
    public ResponseEntity getPayment(@PathVariable("id") Long id) {
        return ResponseEntity.ok(restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class));
    }
}
