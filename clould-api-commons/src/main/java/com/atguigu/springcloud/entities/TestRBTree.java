package com.atguigu.springcloud.entities;

import java.util.Scanner;

/**
 * @author zhang.suxing
 * @date 2020/8/2 15:09
 **/
public class TestRBTree {

    public static void main(String[] args) {
        RBTree<String, Object> rbt = new RBTree();
        //测试输入：ijkgefhdabc
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入key:");
            String key = sc.next();

            rbt.insert(key, null);
            TreeOperation.show(rbt.getRoot());
        }
    }
}
