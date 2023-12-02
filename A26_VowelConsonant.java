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
public class A26_VowelConsonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter a small letter: ");
        ch=input.next().charAt(0) ;  
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }
        else if(ch=='i'){
            System.out.println("Vowel");
        }
        else if(ch=='o'){
            System.out.println("Vowel");
        }
        else if(ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
                
         }
}
