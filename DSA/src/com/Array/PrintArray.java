package com.Array;

public class PrintArray {
    public static void main(String[] args) {

        int array[]={1,2,3,4,5,6};
        printArray(array, array.length, 0);
        System.out.println();
        printRevArray(array, array.length, 0);
        System.out.println();
    }

    public static int printArray(int arr[],int size,int index){
        if (index==size) {
            return 0;
        }
        else {
            System.out.print(arr[index]+" ");
            printArray(arr, size, ++index);
            return 0;
        }
    }

    public static int printRevArray(int arr[],int size,int index){
        if (index==size) {

            return 0;
        }
        else {
            //System.out.print(arr[size-1-index]+" ");
            printRevArray(arr, size, ++index);
            index = index-1;
            System.out.print(arr[index]+" ");
            return 0;
        }
    }
}
