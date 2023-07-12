package com.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        display(array);
        bubbleSort(array);
        display(array);
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        int dummy[]=arr;
        int temp;
        boolean status = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(dummy[j]>dummy[j+1]){
                    temp=dummy[j+1];
                    dummy[j+1]=dummy[j];
                    dummy[j]=temp;
                    status = true;
                }
            }
            if (status==false){
                System.out.println("nope");
                break;
            }
        }
    }
}
