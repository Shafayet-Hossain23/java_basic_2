
package com.mycompany.javabasic2;

import java.util.Scanner;


public class A66_Assigment {
    public static void main(String[] args) {
        String userName,password;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        userName=input.nextLine();
        System.out.print("Enter Your Password: ");
        password=input.nextLine();
        
        if("Junayed Hossain".equals(userName) && "123456".equals(password)){
            System.out.println("Login Successfully");
        }
        else{
            System.out.println("Incorrect password or usename");
        }
    }
 
}
