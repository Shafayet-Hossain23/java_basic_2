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
public class A45_SumOfOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,sum=0;
        System.out.print("Enter num1: ");
        num1=input.nextInt();
        System.out.print("Enter num2: ");
        num2=input.nextInt();
        
        if(num1>num2){
            System.out.println("Num2 should be greater than num1");
        }
        else if(num1%2==0 || num2%2==0){
            System.out.println("Please enter odd number as num1 and num2");
        }
        else{
            for (int i = num1; i <=num2; i+=2) {
                sum=sum+i;
                
            }
            System.out.println("Sum of you given range: "+sum);
        }
    }
  
}
