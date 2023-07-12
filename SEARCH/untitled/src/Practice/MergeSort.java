package Practice;

public class MergeSort {
    public void sort(int[] arr,int first,int last) {
        int middle;
        if (last > first) {
            middle = (first + last) / 2;
            sort(arr, first, middle);
            sort(arr, middle + 1, last);
            merge(arr, first, middle, last);
        }
    }

    public void merge(int[] arr,int first,int middle,int last){
        int i=first;
        int j=middle+1;
        int index=first;
        int p=first;
        int[] temp = new int[arr.length];
        while(i<=middle && j<= last){
            if(arr[i]<arr[j]){
                temp[index++]=arr[i++];
            }
            else{
                temp[index++]=arr[j++];
            }
        }
        if(i>middle){
            while(j<=last){
                temp[index++]=arr[j++];
            }
        }
        else{
            while(i<=middle){
                temp[index++]=arr[i++];
            }
        }

        while(p<index){
            arr[p]=temp[p];
            p++;
        }
    }

    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
