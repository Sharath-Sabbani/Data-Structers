package com.Array;

import javax.script.SimpleScriptContext;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size=sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Value : ");
        int val = sc.nextInt();
        occuranceFirst(array, array.length, 0,val);
        //System.out.println(occuranceFirst(array, array.length, 0,val));

    }

    public static int occuranceFirst(int arr[],int size,int index,int val){

        if(index==size){
            return -1;
        }
        else{
            if(arr[index]==val){
                System.out.println(index);
                return 0;
            }
            occuranceFirst(arr, size, ++index, val);
            return 0;
        }
    }
}
