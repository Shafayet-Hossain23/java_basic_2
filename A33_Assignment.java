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
public class A33_Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Choose an option (1/2/3/4): ");
        number=input.nextInt();
        
        switch(number){
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Arabic");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            default:
                System.out.println("Other language");
               
        }
    }
}
