
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A69_Assignment {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("How many rows you want: ");
        num=input.nextInt();
        
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if(col%2==0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(" 1 ");
                }
            }
            System.out.println("");
        }
    }
 
}
