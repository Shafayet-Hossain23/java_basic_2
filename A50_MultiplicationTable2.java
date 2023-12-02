package com.mycompany.javabasic2;

import java.util.Scanner;
// ******
public class A50_MultiplicationTable2 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int num1,num2;
         System.out.print("Enter first number: ");
         num1=input.nextInt();
         System.out.print("Enter second number: ");
         num2=input.nextInt();
         
         for (int i = num1; i <= num2; i++) {
             for (int j = 1; j <= 10; j++) {
                 System.out.println(i+" x "+j+" = "+num1*j);
             }
             System.out.println("\n \n");
        }
    }
    
}
