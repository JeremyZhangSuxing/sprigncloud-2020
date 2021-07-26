package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang.suxing
 * @date 2020/5/6 23:39
 * SpringCloud原生注解 支持Nacos的动态刷新功能，如果使用的是Apollo 可以按照apollo 约定来实现动态刷新配置的阿properties配置binder类
 **/

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}

