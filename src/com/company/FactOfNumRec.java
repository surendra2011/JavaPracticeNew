package com.company;

import java.util.Scanner;

public class FactOfNumRec {
    static int fact=1;
    static void printFact(int num){
        if(num>0){
            fact = num*fact;
            num--;
            printFact(num);
        }
        else{
            System.out.println("Factorial of a number is " +fact);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get factorial: ");
        int num = sc.nextInt();
        printFact(num);
    }
}
