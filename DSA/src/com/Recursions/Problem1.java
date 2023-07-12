package com.Recursions;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        printPattern(a);
    }

    public static int printPattern(int n){
        if(n<1){
            return 0;
        }
        else {
            System.out.print(n);
            printPattern(n-1);
            System.out.print(n);
            printPattern(n-1);
            System.out.print(n);
        }
        return 0;
    }

}
