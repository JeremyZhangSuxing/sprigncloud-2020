package com.atguigu.springcloud.entities;

/**
 * @author zhang.suxing
 * @date 2020/8/15 20:15
 **/
public class OrderTest {

    private static int[] array = new int[]{1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        System.out.println("normal query  index for x is :   " + orderArray(array, 7));
        System.out.println("normal query  index for x is :   " + recursion(array, 0, array.length - 1, 3));

    }


    /**
     * 普通二分法查找  1的下标
     */
    private static int orderArray(int[] array, int x) {
        int middleIndex;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            System.out.println("querying  ===");
            middleIndex = (low + high) / 2;
            if (array[middleIndex] > x) {
                high = middleIndex - 1;
            } else if (array[middleIndex] < x) {
                low = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    /**
     * 递归获取元素下标 无则返回-1
     */
    private static int recursion(int[] array, int low, int high, int x) {
        if (low <= high) {
            int middleIndex = (low + high) / 2;
            if (array[middleIndex] > x) {
                high = middleIndex - 1;
                recursion(array, low, high, x);
            } else if (array[middleIndex] < x) {
                low = middleIndex + 1;
                recursion(array, low, high, x);
            } else {
                return middleIndex;
            }
        }
        return -1;
    }


    //快速排序
}
