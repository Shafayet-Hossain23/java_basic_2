package com.mycompany.javabasic2;

import java.util.Scanner;

public class A67_Pattern {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("How many row you want: ");
        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
//                System.out.print(" "+col);
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
