package com.mycompany.javabasic2;

import java.util.Scanner;

public class A62_Palindrome_m_n {

    public static void main(String[] args) {
        int num1, num2, temp, r, sum = 0,totalNumber=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number: ");
        num1 = input.nextInt();
        System.out.print("Enter terminal number: ");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(i==sum){
                System.out.print(i+ " ");
                totalNumber++;
            }
            sum=0;
        }
        System.out.println("");
        System.out.println("Total Number of Palindrome is : "+totalNumber);

    }
}
