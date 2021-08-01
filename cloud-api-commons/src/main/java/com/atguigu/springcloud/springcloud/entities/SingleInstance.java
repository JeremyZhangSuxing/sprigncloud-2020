package com.atguigu.springcloud.springcloud.entities;

/**
 * @author zhang.suxing
 * @date 2020/8/16 16:15
 **/
public class SingleInstance {

    private static SingleInstance singleInstance;

    private SingleInstance() {
    }

    /**
     * 线程安全但是开销较大
     *
     */
    public static synchronized SingleInstance buildSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }
}
