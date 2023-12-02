
package com.mycompany.javabasic2;

import java.util.Scanner;

//******
public class A55_FibbonacciSeries2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the number for which fibonacci number you want to see: ");
        num=input.nextInt();
        
       int first=0;
       int second=1;
       int fibo=0;
       
       if(num == 1){
           System.out.println("The fibbonacci number is :"+0);
       }
       else if(num == 2){
       System.out.println("The fibbonacci number is :"+1);
       }
       
       else{
        for (int i = 3; i <=num; i++) {
            fibo=first+second;
            first=second;
            second=fibo;
        }
         System.out.println("The fibbonacci number is : "+fibo);
       }
       
       
    }
}
