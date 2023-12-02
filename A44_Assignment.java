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
public class A44_Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int fact=1;
        System.out.print("Enter a number: ");
        number=input.nextInt();
        
        for (int i=1; i <= number; i++) {
            fact=fact*i;
        }
        System.out.print("The factorial is: "+fact);
    }
   
    
}
