/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasic2;

import java.util.Scanner;

//*****
public class A53_PrimeNumber_m_n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, count = 0, totalPrime = 0;
        System.out.print("Enter initial number: ");
        num1 = input.nextInt();
        System.out.print("Enter terminate number: ");
        num2 = input.nextInt();
        if (num1 == 0 || num1 == 1 || num2 == 0 || num2 == 1) {
            System.out.println("Please avoid 0 and 1 for num1 and num2");
        } else {
            for (int i = num1; i <= num2; i++) {
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                    totalPrime++;
                } else {
                    count = 0;
                }
            }
            System.out.println("The total prime number between range: "+totalPrime);
        }
    }
}
