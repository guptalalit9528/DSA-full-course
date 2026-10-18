package dsa_with_java.Array;

import java.util.Scanner;

//Count Even and Odd Numbers
//Problem: Take the array size and elements as input, then count how many numbers are even and how many are odd.

public class CountEvenAndOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");

        int n = sc.nextInt();
        int arr[] = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("These are numbers : ");
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
            for(int i = 0; i<n;i++){
            if (arr[i]%2==0) {
                System.out.println("These elements are even : " +arr[i]);
                even++;
            }else {
                System.out.println("These elements are odd : "+arr[i]);
                odd++;
            }
        }
        System.out.println();
        System.out.println("Count the Even Numbers :"+even);
        System.out.println("Count the Odd Numbers :"+odd);
    }
}
