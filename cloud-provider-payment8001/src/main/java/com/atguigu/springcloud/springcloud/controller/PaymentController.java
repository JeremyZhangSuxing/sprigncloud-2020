package com.atguigu.springcloud.springcloud.controller;

import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import com.atguigu.springcloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhang.suxing
 * @date 2020/5/6 23:39
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     *只传给前端CommonResult，不需要前端了解其他的组件
     */
    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if(result > 0){
            return new CommonResult<>(200,"插入数据成功",result);
        }else{
            return new CommonResult<>(444,"插入数据失败",null);
        }
    }

    /**
     *
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+payment+"wewe");
        if(payment != null){
            return new CommonResult<>(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult<>(444,"没有对应记录,查询ID："+id,null);
        }
    }
}
