package dsa_with_java.Array;

import java.util.Scanner;

public class SearchForAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("There Are the Array element : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Searching value : ");
        int target  = sc.nextInt();
        for (int i = 0; i<n; i++){
            if(arr[i]==target ){
                System.out.println("Target match " + arr[i] +"...Element is foun in index is : "+i);
            }
        }

    }
}
