package com.ananyo;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a fruit:");
        String a=sc.next();
        switch (a){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");

        }

    }
}
