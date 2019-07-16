package com.learn.sort;

/**
 * @Author: shixiaofei
 * @Description:
 * @Date: 2019/4/10 16:01
 * @Version: 1.0
 */
public class MergeSort {

    public static void main(String[] args) {


        int [] a = {324,3,2,6};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a,1,2);
        for (int i:a ) {
            System.out.print(i+"\t");
        }
    }

    public void sort(int[] arr, int l, int r) {
        if(arr==null || arr.length<2)return;
        if(l==r)    return;
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, r, mid);
    }

    public void merge(int[] arr, int l, int r, int mid) {

        int[] temp = new int[r- l + 1];
        int i=0;
        int p1 =l;
        int p2 = mid + 1;
       while(p1<=mid&&p2<=r){
           temp[i++]= arr[p1]<arr[p2] ? arr[p1++]:arr[p2++];
       }

       while(p1<=mid){
           temp[i++]=arr[p1++];
       }

       while(p2<=r){
           temp[i++]=arr[p2++];
       }

        for (int j = 0; j < temp.length; j++) {
           arr[l++]=temp[j];
        }
    }
}
