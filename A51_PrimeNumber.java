package com.mycompany.javabasic2;

import java.util.Scanner;

public class A51_PrimeNumber {
//*****
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number for check Prime Number: ");
        num = input.nextInt();

        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("Not a prime Number");
        } else {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }

    }

}
