
package com.mycompany.javabasic2;

//******* sum of digits 

import java.util.Scanner;

public class A57_SumOfDigits {
    public static void main(String[] args) {
        int num,temp,remainder,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0){
        remainder=temp%10;
        sum=sum+remainder;
        temp=temp/10;
        }
        System.out.println("The sum of digits: "+sum);
    }
}
