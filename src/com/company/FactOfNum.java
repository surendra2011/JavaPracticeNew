package com.company;

import java.util.Scanner;

public class FactOfNum {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to which need to get factorial: ");
        int num = sc.nextInt();
        for(int i=num; i>0;i--){
            fact = i*fact;
        }
        System.out.println("The factorial of the number " + num + " is " + fact);
    }

}
