package search.io;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("LINEAR SEARCH");
        System.out.println("Size of the Array: ");
        Scanner sc0 = new Scanner(System.in);
        int size = sc0.nextInt();
        int arr[] = new int[size];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter array Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc1.nextInt();
        }
        System.out.println("Number to searched in array: ");
        int number = sc1.nextInt();
//        linearSearch(arr,number);
        int index =binarySearch(arr,0,arr.length-1,number);
        System.out.println("Index: "+index);
        int position =index+1;
        System.out.println("Position: "+position);
    }

//    public static void linearSearch(int arr[],int item){
//        int flag=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==item){
//                System.out.println(item +" is at index: "+ i);
//                System.out.println(item +" is at position: "+ (int)(i+1));
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1){
//            System.out.println("Given array has "+item+" in it");
//        }
//        else System.out.println(item+" not found in given array");
//    }

    public static int binarySearch(int arr[],int left,int right,int item){
        if(right>=left){
            int M = left+((right-left)/2);
            if(arr[M]==item){
                return M;
            }
            else if (arr[M]<item) {
                return binarySearch(arr,M+1,right,item);
            }
            else{
                return binarySearch(arr,left,M-1,item);
            }
        }
        else{
            return -1;
        }
    }
}

