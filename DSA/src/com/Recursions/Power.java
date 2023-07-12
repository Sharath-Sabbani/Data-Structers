package com.Recursions;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

    public static int power(int a,int b){
        if(b!=0)
            return a*power(a,--b);
        else
            return 1;
    }
}
