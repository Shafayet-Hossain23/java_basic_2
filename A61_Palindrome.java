
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A61_Palindrome {
    public static void main(String[] args) {
        int num,temp,r,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number to check palindrome: ");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            
        }
        if(sum==num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a palindrome Number");
        }
    }
}
