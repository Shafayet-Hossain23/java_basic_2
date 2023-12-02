
package com.mycompany.javabasic2;

import java.util.Scanner;

//Reverse of number ****
public class A59_ReverseNumber {
    public static void main(String[] args) {
        int num,temp,remainder,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        num=input.nextInt();
        temp=num;
        
        while(temp!=0){
        remainder=temp%10;
        sum=sum*10+remainder;
        temp=temp/10;
        }
        System.out.println("The reverse of number is: "+sum);
    }
}
