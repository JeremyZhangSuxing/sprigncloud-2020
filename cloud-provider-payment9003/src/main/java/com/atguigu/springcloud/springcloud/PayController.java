package com.atguigu.springcloud.springcloud;

import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author suxing.zhang
 * @date 2021/8/1 20:44
 **/
@RestController
public class PayController {
    private static Map<String, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put("1", new Payment(1L, "jeremy1"));
        hashMap.put("2", new Payment(2L, "knight2"));
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> queryById(@PathVariable String id) {
        return new CommonResult<>(0, "success--------9003", hashMap.get(id));
    }
}
