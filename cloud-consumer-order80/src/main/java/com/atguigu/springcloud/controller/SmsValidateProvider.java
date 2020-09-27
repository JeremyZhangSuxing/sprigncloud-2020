package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.SmsValidateByMobile;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:06
 **/
@Component
public class SmsValidateProvider implements InitializingBean {

    @Autowired
    private SmsValidateByCountryCode smsValidateByCountryCode;
    @Autowired
    private SmsValidateByMobile smsValidateByMobile;



    @Override
    public void afterPropertiesSet() throws Exception {
        //加载数据到缓存中


    }

    public




}
