package com.learn.sort;

import java.util.BitSet;

/**
 * @Author: shixiaofei
 * @Description:
 * @Date: 2019/4/6 19:07
 * @Version: 1.0
 */
public class InsertSort {


    public static void main(String[] args) {
        int [] array = {234,2,34,23};
        InsertSort insertSort = new InsertSort();
//        insertSort.sort(array);array[j]>array[j+1]
        insertSort.sort2(array);
        for(int i:array){
            System.out.print(i+"\t");
        }
    }

    public void sort(int [] array){

        if(array==null&&array.length<2)return;
        for (int i = 1; i < array.length; i++) {
            for (int j=i-1;j>=0;j--){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public void sort2(int [] array){

        if(array==null&&array.length<2)return;
        for (int i = 1; i < array.length; i++) {
            for (int j=i-1;j>=0&&array[j]>array[j+1];j--){
                    swap(array,j,j+1);
            }
        }
    }


    public void swap(int [] array,int i,int j){
        array[i]=array[i]^array[j];
        array[j]=array[i]^array[j];
        array[i]=array[i]^array[j];
    }
}
