package com.mycompany.javabasic2;

import java.util.Scanner;

public class A54_FibbonacciSeries {
//0 1 1 2 3 5 8 13...
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("How many number you want for fibbonacci series: ");
        num = input.nextInt();

        int first = 0;
        int second = 1;
        int fibo;
        System.out.print(first+ " " + second);
        
        for (int i = 3; i <=num; i++) {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }

    }
}
