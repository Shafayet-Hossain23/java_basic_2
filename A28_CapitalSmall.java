
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A28_CapitalSmall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch=input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("small letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a letter");
        }
        
    }
 
}
