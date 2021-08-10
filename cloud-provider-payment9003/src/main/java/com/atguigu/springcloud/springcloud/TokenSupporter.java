package com.atguigu.springcloud.springcloud;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author suxing.zhang
 * @date 2021/8/10 20:47
 **/
@Data
@Component
public class TokenSupporter implements InitializingBean {
    private String uuid;

    @Override
    public void afterPropertiesSet() throws Exception {
        uuid = "";
    }
}
