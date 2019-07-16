package com.learn.sort;

/**
 * @Author: shixiaofei
 * @Description:
 * @Date: 2019/4/6 18:39
 * @Version: 1.0
 */
public class SelectionSort {

    public void sort(int [] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length ; j++) {
                int temp = array[i];
                if(array[j]<temp){
                   array[i]= array[j];
                   array[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");

        }

    }
}
