package com.atguigu.springcloud.controller;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:03
 **/
public interface SmsValidateByCountryCode {

    Boolean filterByWhiteList(String businessCode);

    Boolean filterByBlackCode(String businessCode);


}
