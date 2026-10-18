package dsa_with_java.Array;

import java.util.Scanner;

//Maximum Subarray Sum
//Problem: Given an integer array containing positive and negative numbers, find the maximum sum of a contiguous subarray

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int sum = 0;

        System.out.println("These are numbers: ");

        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i< n; i++){
            sum = sum+ arr[i];
        }

        System.out.print("Total Sum is : "+sum);
    }
}
