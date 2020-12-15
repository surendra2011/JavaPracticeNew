package com.company;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int FirstNum= 0;
        int SecondNum= 1;
        int count = 2;
        System.out.print("Number of data requried to add - ");
        int NumReq = sc.nextInt();
        System.out.print(FirstNum + " ");
        System.out.print(SecondNum + " ");
        while (count <= NumReq) {
            int SumNum = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = SumNum;
            count = count + 1;
            System.out.print(SecondNum + " ");
        }
    }
}
