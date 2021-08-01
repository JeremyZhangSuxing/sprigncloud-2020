package com.atguigu.springcloud.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang.suxing
 * @date 2020/5/6 23:17
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
