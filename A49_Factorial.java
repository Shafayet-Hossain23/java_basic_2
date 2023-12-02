
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A49_Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,fact=1;
        System.out.print("Enter a number: ");
        num=input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" x ");
            fact=fact*i;
        }
        System.out.println("");
        System.out.println("Factorial of the number is: "+fact);
    }
}
