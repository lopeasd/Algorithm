package com.learn.sort;

/**
 * @Author: shixiaofei
 * @Description:
 * @Date: 2019/4/14 15:40
 * @Version: 1.0
 */
//父节点------>(i-1)/2
// 子节点----->2*i+1，2*i+2;
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {8, 8, 98, 2, 6, 8, 9, 3, 98};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr, 0, arr.length);
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        ;
        System.out.println();
        heapSort.heapify(arr, arr.length);
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        ;
    }

    public static void sort(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            heapInsert(arr, i);
        }
    }

    /**
     * 插入一个数调整为堆结构
     */
    public static void heapInsert(int[] arr, int index) {
        if (index == 0) {
            return;
        }
       /*   int large= index;
      while(index>0){
            large = arr[(index-1)/2]>arr[index]? (index-1)/2 : index;

            if(large==index){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
            }else{
                break;
            }
        }*/
//小根堆
        while (index > 0) {
            int small = arr[(index - 1) / 2] > arr[index] ? (index - 1) / 2 : index;
            if (small != index) {
                swap(arr, index, small);
                index = (index - 1) / 2;
            } else {
                break;
            }
        }
    }

    /**
     * @param arr      原数组
     * @param heapsize 堆的大小
     */
    public void heapify(int arr[], int heapsize) {
        while (heapsize > 0) {
            swap(arr, 0, --heapsize);
            //重新调整为堆结构
            sort(arr, 0, heapsize);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
