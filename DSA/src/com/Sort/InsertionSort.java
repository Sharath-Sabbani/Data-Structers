package com.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3,4,7,9,6,5,8,2};
        display(array);
        insertionSort(array);
        display(array);
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        int temp;
        for(int i=1;i< arr.length;i++){
            temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
}
