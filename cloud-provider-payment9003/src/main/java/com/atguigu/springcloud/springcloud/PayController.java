package com.atguigu.springcloud.springcloud;

import com.atguigu.springcloud.springcloud.entities.CommonResult;
import com.atguigu.springcloud.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @author suxing.zhang
 * @date 2021/8/1 20:44
 **/
@RestController
public class PayController {
    @Autowired
    private TokenSupporter tokenSupporter;
    @Autowired
    private TestService testService;
    private static Map<String, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put("1", new Payment(1L, "jeremy1"));
        hashMap.put("2", new Payment(2L, "knight2"));
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> queryById(@PathVariable String id) {
        return new CommonResult<>(0, "success--------9003", hashMap.get(id));
    }

    @GetMapping("/token")
    public CommonResult<String> token(@RequestParam String token) {
        tokenSupporter.setUuid(token);
        for (int i = 0; i < 20; i++) {
            CompletableFuture.runAsync(() -> {
                System.out.println(Thread.currentThread().getName() + "---" + Thread.currentThread().getId() + "----" + testService.getToken());
            });

        }
        return new CommonResult<>(0, "token is validate", null);
    }
}
