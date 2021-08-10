package com.atguigu.springcloud.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suxing.zhang
 * @date 2021/8/10 20:57
 **/
@Service
public class TestService {
    @Autowired
    private TokenSupporter tokenSupporter;

    public String getToken() {
        return tokenSupporter.getUuid();
    }
}
