package com.atguigu.springcloud.springcloud.dao;

import com.atguigu.springcloud.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhang.suxing
 * @date 2020/5/6 23:11
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
