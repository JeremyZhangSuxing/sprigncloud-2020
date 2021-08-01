package com.atguigu.springcloud.springcloud.handler;

import com.atguigu.springcloud.springcloud.entities.CommonResult;

/**
 * @author suxing.zhang
 * @date 2021/8/1 12:05
 **/
public class BlockExceptionHandler {

    public static CommonResult handlerException1() {
        return new CommonResult(-1, "系统异常吧!");
    }

    public static CommonResult handlerException2() {
        return new CommonResult(-2, "网络异常!");
    }

}
