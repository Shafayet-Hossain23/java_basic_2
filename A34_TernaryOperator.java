
package com.mycompany.javabasic2;

import java.util.Scanner;

public class A34_TernaryOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        System.out.print("Enter two interger number: ");
        num1=input.nextInt();
        num2=input.nextInt();
        
        result=num1>num2?num1:num2;
        System.out.println("The greatest number is: "+result);
    }
  
}
