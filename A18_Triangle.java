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
public class A18_Triangle {
    public static void main(String[] args) {
        double height,base,area;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter Height: ");
        height=input.nextDouble();
        
        System.out.print("Enter Base: ");
        base=input.nextDouble();
        
        area =0.5*height*base;
        System.out.println("The area of triangle is: "+area);
                
    }
}
