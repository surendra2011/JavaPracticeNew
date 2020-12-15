package com.company;

import java.util.Scanner;

public class FibonacciSeriesRecursion {
        static int FirstNum= 0, SecondNum= 1;
        static int NumReq = 7, SumNum = 0;
        static void printFibonacci(int count){
            if (count <= NumReq) {
                SumNum = FirstNum + SecondNum;
                FirstNum = SecondNum;
                SecondNum = SumNum;
                System.out.print(SecondNum + " ");
                count = count + 1;
                printFibonacci(count);
            }
        }

        public static void main(String args[]){
            int count = 2; // first two number are printing so count start from 2
            System.out.print(FirstNum+" "+SecondNum + " ");//printing 0 and 1
            printFibonacci(count);
        }
}

