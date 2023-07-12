package Practice;

public class LinearSearch {
    public void search(int arr[],int item){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("Number found at : "+i);
                flag =1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Number not Found");
        }
    }
}
