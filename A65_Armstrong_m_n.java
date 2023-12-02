package com.mycompany.javabasic2;

import java.util.Scanner;

public class A65_Armstrong_m_n {

    public static void main(String[] args) {
        int num1, num2, temp, r, sum,totalNumber=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        num1 = input.nextInt();
        System.out.print("Enter the terminate number: ");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            sum = 0;
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum=sum+r*r*r;
                temp=temp/10;
            }
            if(sum==i){
                System.out.print(i+" ");
                totalNumber++;
            }
        }
        System.out.println("");
        System.out.println("Total number of armstrong: "+totalNumber);
    }
}
