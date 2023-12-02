
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A68_Pattern2 {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("How many rows you want: ");
        num=input.nextInt();
        
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
        }
        
    }
 
}
