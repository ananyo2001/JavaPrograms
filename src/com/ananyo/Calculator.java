package com.ananyo;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("-------------Calculator-------------");
        Scanner sc = new Scanner(System.in);
        while(true){
            //operator input
            System.out.println("Enter operator (press x to exit)");
            char op=sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='/'||op=='*'||op=='%'){
                //input two numbers
                System.out.println("Enter num1 ");
                int num1 =sc.nextInt();
                System.out.println("Enter num2 ");
                int num2 =sc.nextInt();
                if(op=='+') System.out.println(num1+num2);
                else if(op=='-') System.out.println("ans = "+(num1-num2));
                else if(op=='*') System.out.println("ans = "+(num1*num2));
                else if(op=='/') System.out.println("ans = "+(num1/num2));
                else if(op=='%') System.out.println("ans = "+(num1%num2));
            }else if(op=='x'||op=='X'){
                System.out.println("Exiting");
                break;
            }else{
                System.out.println("!!! Enter a valid operator !!!");
            }

        }
    }
}
