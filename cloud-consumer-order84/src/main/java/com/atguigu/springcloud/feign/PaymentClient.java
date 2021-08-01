package com.atguigu.springcloud.feign;

import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author suxing.zhang
 * @date 2021/8/1 20:56
 **/
@FeignClient(name = "nacos-payment-client")
public interface PaymentClient {
    /**
     * query payment info
     * @param id id
     * @return paymentInfo
     */
    @GetMapping("/payment/{id}")
    public CommonResult<Payment> queryById(@PathVariable(value = "id") String id);
}
