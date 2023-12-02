
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A22_ControlStatement1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.print("Enter a interger number: ");
        num1=input.nextInt();
        
        if(num1>0){
            System.out.println("The number is positve");
        }
        else{
            System.out.println("The number is not positive");
        }
    }
 
}
