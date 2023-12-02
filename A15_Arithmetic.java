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
public class A15_Arithmetic {
    public static void main(String[] args) {
        double num1;
        double num2;
        
        
        Scanner inputNum1=new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1=inputNum1.nextDouble();
        
        Scanner inputNum2=new Scanner(System.in);
        System.out.println("Enter num2: ");
        num2=inputNum2.nextDouble();
        
       double resultAdd=num1+num2;
        System.out.println("Add: "+resultAdd);
        
       double resultSub=num1-num2;
        System.out.println("Sub: "+resultSub);
        
       double resultMultiply=num1*num2;
        System.out.println("Multiply: "+resultMultiply);
        
       double resultDiv=num1/num2;
        System.out.println("Div: "+resultDiv);
        
       double resultReminder=num1%num2;
        System.out.println("Reminder: "+resultReminder);
    }
}
