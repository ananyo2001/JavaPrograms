package com.ananyo;
import java.util.Scanner;
public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        long num=sc.nextLong();
        System.out.println("Enter the digit tobe counted");
        int di=sc.nextInt();
        int count=0;
        while(num>0){
            long temp = num % 10;
            if(temp ==di){
                count++;
            }
            num=num/10;
        }
        System.out.println("The digit appeared "+count+" times");

    }



}
