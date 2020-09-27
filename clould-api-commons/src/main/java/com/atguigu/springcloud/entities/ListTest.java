package com.atguigu.springcloud.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhang.suxing
 * @date 2020/8/15 21:55
 **/
public class ListTest {

    /**
     * 指定位置插入一个元素
     * ArrayList
     * 初始化的时候初始化了数组的长度，没有改变size 的长度
     * src:源数组 srcPos:原数组开始位置  dest:目标数组 desPos:目标数组位置   length:要复制的元素的数量
     * 次方法的目的就是：就是将源数组从指定位置开始，复制length个元素到目标数组的指定位置。
     *  1.check 当前数组的size 与即将插入元素的index 小于0 还是index > size
     *  2.开辟出一块新的空间，容量 数组长度+1
     *  3.将原来的数组copy到新的数组里面去
     *  4.向指定的 index插入element
     *  5.维护list 的sizes属性+1
     * LinkedList
     * 1.判断index是否合法
     * 2.index==size  链表尾插
     * 3.遍历链表获取index节点，创建新的节点 判断该节点的前置节点是否为null
     * 1---》头节点为插入element 2---》前置节点的引用指向新的节点
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        List<String> strings = new LinkedList<>();

        list.add(0,0);
        list.add(1,100);
        list.add(0,9);


        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
