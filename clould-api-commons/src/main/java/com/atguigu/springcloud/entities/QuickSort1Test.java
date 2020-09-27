package com.atguigu.springcloud.entities;

import java.util.Arrays;

/**
 * @author zhang.suxing
 * @date 2020/8/17 13:13
 **/
public class QuickSort1Test {

    /**
     * 快速排序原理
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {10,5,3,7,1};
        quickOrder(array, 0, array.length - 1);
        Arrays.stream(array).forEach(System.out::println);

    }


    private static void quickOrder(int[] array, int low, int high) {
        //第一次获取到的基准值位置 以此位置将数组切割为两部分继  左半部分全部小于基准值，后半部分全部大于基准值
        if (low < high) {
            int index = getIndex(array, low, high);

            //以这个基准值将左右两部分 递归调用
//            quickOrder(array, low, index - 1);
//            quickOrder(array, index + 1, high);
        }
    }

    private static int getIndex(int[] array, int low, int high) {
        int standardValue = array[low];
        while (low < high) {
            //从数组的右侧开始向左位移 直到第一个value > standardValue stop ,put this value to arrays head
            while (low < high && array[high] <= standardValue) {
                high--;
            }
            //直到第一个 value < standardValue stop,put this value to arrays tail
            array[low] = array[high];


            //从数组的左边开始向右边移动
            while (low < high && array[low] >= standardValue) {
                low++;
            }
            //直到第一个 value < standardValue stop,put this value to arrays tail
            array[high] = array[low];
        }
        //左右移动的 标志位来到同一值,确认该位置为 基准值的位置
        array[low] = standardValue;
        return high;
    }
}
