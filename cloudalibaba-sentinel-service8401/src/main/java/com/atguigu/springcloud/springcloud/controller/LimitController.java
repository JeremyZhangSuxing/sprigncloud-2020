package com.atguigu.springcloud.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import com.atguigu.springcloud.springcloud.handler.BlockExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxing.zhang
 * @date 2021/8/1 11:31
 **/
@RestController
public class LimitController {

    @RequestMapping("/byResource")
    @SentinelResource(value = "byResource", fallback = "handlerException")
    public CommonResult byResource() {
        return new CommonResult<>(0, "按照资源名称测试 ok", new Payment(2020L, "serial 2020L"));
    }

    public CommonResult handlerException(BlockException blockException) {
        return new CommonResult(999, blockException.getClass().getCanonicalName() + "导致服务不可用");
    }

    @RequestMapping("/byResourceUrl")
    @SentinelResource(value = "byResourceUrl", fallback = "handlerException")
    public CommonResult byResourceUrl() {
        return new CommonResult<>(0, "按照url名称测试 ok", new Payment(2020L, "serial 2020L"));
    }

    @RequestMapping("/byCustomerHandler")
    @SentinelResource(value = "byCustomerHandler", fallbackClass = BlockExceptionHandler.class, blockHandler = "handlerException2")
    public CommonResult byCustomerHandler() {
        return new CommonResult(0, "按照定制化的handler 处理...", new Payment(2020L, "serial 2020L"));
    }
}
