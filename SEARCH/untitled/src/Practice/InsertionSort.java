package Practice;

public class InsertionSort {
    public void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }

    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
