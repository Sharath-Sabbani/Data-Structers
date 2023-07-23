class LeetCode {
    public static void main(String[] args) {
        numWaterBottles(9,3);
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int dummy,dummy1;
        int sum=0;
        sum =sum+ numBottles;
        do{
            dummy = numBottles%numExchange ;
            dummy1 = numBottles/numExchange ;
            sum =sum + dummy1;
            numBottles = dummy + dummy1;
        }while(dummy1!=0);
        System.out.println(sum);
        return sum;
    }
}
