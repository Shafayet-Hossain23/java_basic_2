/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasic2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class A47_SeriesSquare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,sum=0;
        System.out.print("Enter a the last number: ");
        num1=input.nextInt();
        for (int i = 1; i <=num1; i++) {
            System.out.print(i+"x"+i+" ");
            sum=sum+i*i;
            
        }
        System.out.println("");
        System.out.println("Sum: "+sum);
    }
}
