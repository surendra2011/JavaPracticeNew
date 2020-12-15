package com.company;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements required in an array: ");
        int length = sc.nextInt();
        int[] nums = new int[length];
        int minNum,count = 0;
        for (int i =0; i<= length-1; i++){
            System.out.print("Enter the data element: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Elements in an array: ");
        for(int j=0; j<=length-1; j++) {
            System.out.print(nums[j]+ " ");
        }
        System.out.println();
        System.out.print("Enter an element to be search: ");
        int searchElement = sc.nextInt();
        sc.close();
        for(int j=0; j<=length-1; j++) {
            if (nums[j]==searchElement){
                System.out.println(searchElement + "Element is found in the index postion "+ j);
            }
            else{
                count++;
            }
        }
        if (count == length) {
            System.out.println(searchElement + " Element is not found in the array ");
        }
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j])
                {
                    minNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = minNum;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i <length - 1; i++)
        {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[length-1]);
    }
}

