package com.learn.search;

/**
 * @Author: shixiaofei
 * @Description: 二分查找
 * @Date: 2019/6/8 16:00
 * @Version: 1.0
 */


public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        BinarySearch b = new BinarySearch();
        int rank = b.rank(7, a,0,6);
        System.out.println(rank);
    }

    //采用循环二分查找
    public int rank(int key, int[] target) {
        int left = 0;
        int right = target.length - 1;
        while (left <= right) {
            //防止溢出
            int mid = left + (right - left) / 2;//int mid= left+(right-left)<<1;
            if (target[mid] > key) right = mid - 1;
            else if (target[mid] < key) left = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * 递归二分查找
     * @param key 查找的关键字
     * @param target 目标数组
     * @param left 左边界
     * @param right 右边界
     * @return 返回-1 或返回数组中目标下标
     */
    public int rank(int key, int[] target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left);
        if (key < target[mid]) return rank(key, target, left, mid - 1);
        else if (key > target[mid]) return rank(key, target, mid + 1, right);
        else return mid;
    }
}
