package com.atguigu.springcloud.springcloud;

/**
 * @author zhang.suxing
 * @date 2020/9/27 22:47
 **/
public interface SmsValidateByMobile {

    Boolean filterByWhiteMobile(String businessCode);

    Boolean filterByBlackMobile(String businessCode);
}
