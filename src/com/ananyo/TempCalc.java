package com.ananyo;
import java.util.Scanner;
public class TempCalc {
    public static void main(String[] args){
        System.out.println("Enter temp in °C:");
        Scanner sc=new Scanner(System.in);
        float tempc=sc.nextFloat();
        float tempf=(tempc *(9/5))+32;
        System.out.println("Temperature in ℉ ="+tempf);



    }
}
