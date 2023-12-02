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
public class A19_Temperature {
//    c=5/9(f-32)
    public static void main(String[] args) {
        double f,calc;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter farenheit: ");
        f=input.nextDouble();
        calc=0.55555555555*(f-32);
        System.out.println("Converted temperature in celsius: "+calc);
    }
}
