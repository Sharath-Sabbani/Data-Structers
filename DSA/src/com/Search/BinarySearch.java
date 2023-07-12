package com.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8,10};
        System.out.println(binarySearch(array,0, array.length-1,8 ));
    }

    public static int binarySearch(int[] arr,int left,int right,int value){
        if(right>=left){
            int mid=left+(right-left)/2;
            if(arr[mid]==value){
                return mid;
            }
            else if(arr[mid]<value){
                return binarySearch(arr,mid+1,right,value);
            }
            else{
                return binarySearch(arr,left,mid-1,value);
            }
        }
        else{
            return -1;
        }
    }
}
