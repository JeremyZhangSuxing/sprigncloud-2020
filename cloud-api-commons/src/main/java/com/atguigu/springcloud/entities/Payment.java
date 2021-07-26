package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang.suxing
 * @date 2020/5/6 23:09
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
    private Long id;
    private String serial;
}
