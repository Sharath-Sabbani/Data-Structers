package sort.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        System.out.println("Sorted array");
        int[] newArray = selectionSort(arr);
        printArray(newArray);
    }

    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        return arr;
    }


    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return arr;
    }

}
