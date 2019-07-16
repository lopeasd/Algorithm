package com.learn.sort;

/**
 * @Author: shixiaofei
 * @Description:
 * @Date: 2019/4/6 18:15
 * @Version: 1.0
 */

/**
 * i 每一趟循环，找到最大的数放在最后面（共leng-1趟）
 * j，每一次比较，两两交换位置。（第i趟排序，说明后面的不用比较了。）
 */
public class BubbleSort {

    public void maoSort(int [] array){
        if(array==null&&array.length<2)return;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public void swap(int [] array,int i,int j){
        array[i]=array[i]^array[j];
        array[j]=array[i]^array[j];
        array[i]=array[i]^array[j];
    }

    public static void main(String[] args) {
        int [] a = {1,345,2,4,23,6};
        BubbleSort maoPao = new BubbleSort();
        maoPao.maoSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

}
