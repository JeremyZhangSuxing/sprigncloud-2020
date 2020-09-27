package com.atguigu.springcloud.controller;

import org.springframework.stereotype.Component;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:04
 **/
@Component
public class SmsValidateByCountryCodeImpl implements SmsValidateByCountryCode{

    @Override
    public Boolean filterByWhiteList(String businessCode) {
        /**
         * 命中配置白名单那则直接放行
         */
        return true;
    }

    @Override
    public Boolean filterByBlackCode(String businessCode) {
        /**
         * 命中配置黑名单则直接放行
         */
        return true;
    }
}
