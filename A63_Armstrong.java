package com.mycompany.javabasic2;

import java.util.Scanner;

public class A63_Armstrong {

    public static void main(String[] args) {
        int num, r, temp, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check armstrong or not: ");
        num = input.nextInt();

        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("This is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
