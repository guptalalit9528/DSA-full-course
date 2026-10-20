package dsa_with_java.Array;

import java.util.Scanner;
//traversal method
public class Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("This is a traversal method : ");
        for(int i = 0; i< n; i++) {
            int sum = arr[i]+2;
            System.out.println(sum);
        }
    }
}
