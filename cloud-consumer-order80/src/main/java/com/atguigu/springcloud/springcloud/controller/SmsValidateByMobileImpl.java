package com.atguigu.springcloud.springcloud.controller;

import com.atguigu.springcloud.springcloud.SmsValidateByMobile;
import org.springframework.stereotype.Component;

/**
 * @author zhang.suxing
 * @date 2020/9/27 22:50
 **/
@Component
public class SmsValidateByMobileImpl implements SmsValidateByMobile {

    @Override
    public Boolean filterByWhiteMobile(String businessCodee) {
        /**
         * db检索  命中则返回true 则放行 进行下一步操作
         * 不存在 则不准放行
         */

        return true;
    }

    @Override
    public Boolean filterByBlackMobile(String businessCode) {
        /**
         * db检索 命中则不放行
         */
        return true;
    }
}
