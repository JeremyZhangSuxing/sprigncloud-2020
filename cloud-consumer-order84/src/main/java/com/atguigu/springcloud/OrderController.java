package com.atguigu.springcloud;

import com.atguigu.springcloud.feign.PaymentClient;
import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author suxing.zhang
 * @date 2021/8/1 21:00
 **/
@RestController
public class OrderController {
    @Resource
    private PaymentClient paymentClient;

    @GetMapping("/order/{id}")
    public CommonResult validateOrder(@PathVariable String id) {
        CommonResult<Payment> paymentCommonResult = paymentClient.queryById(id);
        return paymentCommonResult;
    }

}
