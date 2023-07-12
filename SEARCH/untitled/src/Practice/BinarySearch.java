package Practice;

public class BinarySearch {
    public void search(int arr[],int left,int right,int item){
        if(right>=left) {
            int middle = left + ((right - left) / 2);
            if (arr[middle] == item) {
                System.out.println(middle);
            } else if (arr[middle] > item) {
                search(arr, left, middle - 1, item);
            } else {
                search(arr, middle + 1, right, item);
            }
        }
        else System.out.println("Number not found !!");
    }
}
