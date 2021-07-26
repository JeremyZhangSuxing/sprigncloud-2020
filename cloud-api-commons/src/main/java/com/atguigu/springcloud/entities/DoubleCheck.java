package com.atguigu.springcloud.entities;

/**
 * @author zhang.suxing
 * @date 2020/8/16 16:36
 **/

public class DoubleCheck {
    /**
     * 禁止指令重排序
     */
    private volatile static DoubleCheck instance;

    private DoubleCheck() {

    }

    /**
     * 上述写法看似解决了问题，但是有个很大的隐患。实例化对象的那行代码（标记为error的那行），实际上可以分解成以下三个步骤：
     * 1.
     * 分配内存空间
     * 初始化对象
     * 将对象指向刚分配的内存空间
     * 但是有些编译器为了性能的原因，可能会将第二步和第三步进行重排序，顺序就成了：
     * 2.
     * 分配内存空间
     * 将对象指向刚分配的内存空间
     * 初始化对象
     */
    public DoubleCheck getInstance() {
        if (null == instance) {
            synchronized (DoubleCheck.class) {
                if (null == instance) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
