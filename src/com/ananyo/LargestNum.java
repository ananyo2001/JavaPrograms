package com.ananyo;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        int max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1=sc.nextInt();
        System.out.println("Enter num2 ");
        int num2=sc.nextInt();
        System.out.println("Enter num3 ");
        int num3 = sc.nextInt();
        if(num1>num2){
            max=num1;
        }else{
            max=num3;
        }
        if(num2>num3){
            max=num2;
        }
        System.out.println("The largest number = "+max);

        //OR

        int max2=Math.max(num3,Math.max(num1,num2));
        System.out.println("-----Alternate Method O/P------");
        System.out.println("Maximum num = "+max2);

    }
}
