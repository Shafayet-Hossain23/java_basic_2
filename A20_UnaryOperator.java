/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasic2;

/**
 *
 * @author HP
 */
public class A20_UnaryOperator {
    public static void main(String[] args) {
        int x=10;
      
        int result;
   
        result =-x;
        System.out.println("result: "+result);
        
        result= ++x;
        System.out.println("result: "+result);
        
        result= x++;
        result=x;
        System.out.println("result: "+result);
    }
}
