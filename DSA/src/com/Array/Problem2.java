package com.Array;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(maxValue(array, array.length, 0));
        //System.out.println(maxValue(array, array.length, 0));
    }

    public static int maxValue(int arr[],int size,int index){
        int max;
        if(index==size){
            return 0;
        }
        else{
            max = maxValue(arr,size,++index);
            index=index-1;
            if(max<arr[index]){
                max = arr[index];
            }
            return max;
        }
    }
}
