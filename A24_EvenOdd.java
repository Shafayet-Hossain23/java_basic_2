package com.mycompany.javabasic2;

import java.util.Scanner;


public class A24_EvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num=input.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
