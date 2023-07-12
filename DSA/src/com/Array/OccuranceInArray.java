package com.Array;

public class OccuranceInArray {
    public static void main(String[] args) {
        int array[] = {8,5,5,5,0,3,5,7,2,1};
        firstOccuarance(array, array.length, 0,5);
        System.out.println();
        lastOccuarance(array, array.length, 0,5);
        System.out.println();
    }

    public static int firstOccuarance(int arr[],int size,int index,int value){
        if(index==size){
            return 0;
        }
        else{
            if(arr[index]==value){
                System.out.println("Index value : "+index);
                return 0;
            }
            firstOccuarance(arr,size,++index,value);
            return 0;
        }
    }

    public static int lastOccuarance(int arr[],int size,int index,int value){
        if(index==size){
            return 0;
        }
        else{
            lastOccuarance(arr,size,++index,value);
            index=index-1;
            if(arr[index]==value){
                System.out.println("Index value : "+ (index));
                System.exit(0);
            }

            return 0;
        }
    }
}
