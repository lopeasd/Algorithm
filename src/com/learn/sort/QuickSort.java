package com.learn.sort;

/**
 * @Author: shixiaofei
 * @Description:快速排序
 * @Date: 2019/4/13 15:19
 * @Version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4,2};
        int[] arr1 = {4,3,2,1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        for (int a : arr
                ) {
            System.out.print(a + "\t");
        }
        System.out.println("==================================");
        quickSort.qSort(arr1,0,arr1.length-1);
        for (int b:arr1
             ) {
            System.out.print(b+"\t");
        }
    }

    public void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * @param arr
     * @param i
     * @param j   递归过程
     */
    public void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int[] partition = partition(arr, i, j);
            System.out.println("返回的数组长度" + partition.length + "\t" + partition[0] + "\t" + partition[1]);
            quickSort(arr, i, partition[0] - 1);
            quickSort(arr, partition[1] + 1, j);
        }
    }

    /**
     * 划分出小于区，等于区，大于区
     */
    public int[] partition(int[] arr, int l, int r) {
        int temp = arr[r];
        int cur = l;
//        l = l - 1;
        int less = l - 1;
//        r = r + 1;
        int more = r + 1;
        while (cur < more) {

            if (arr[cur] < temp) swap(arr, cur++, ++less);//小于区
            else if (arr[cur] > temp) swap(arr, cur, --more);//大于区
            else cur++;
        }

//        int[] a = ((l + 1) < (r - 1)) ? new int[]{l, r} : new int[]{l + 1};
        return new int[]{less + 1, more - 1};
    }


    /**
     * @param arr 原始数组
     * @param i   交换的第一个位置
     * @param j   交换的第二个位置
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @param arr 原始数组
     * @param i   交换的第一个位置
     * @param j   交换的第二个位置
     */
    public void swap1(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];


    }


    /**
     * 经典排序
     */
    public static int classical(int[] arr,int l,int r) {
        int temp = arr[l];
        int index = l;
        while (l < r) {
            while (arr[r] > temp) {
                r--;
            }
            while (arr[l] < temp) {
                l++;
            }
            swap(arr, l, r);
        }
        swap(arr,index,l+1);//最后归位
        return l+1;//返回记录值所在位置
    }


    public  void qSort(int [] arr,int l,int r){
        if(l<r){
            int index = classical(arr, l, r);
            classical(arr,l,index-1);
            classical(arr,index+1,r);
        }

    }

}
