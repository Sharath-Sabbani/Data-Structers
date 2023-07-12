package com.Recursions;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10)+" ");
    }

    public static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
