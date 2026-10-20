package dsa_with_java.Array;

import java.util.Arrays;

public class DeletionOperations {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;

        System.out.println("Before Deleting : ");
        for (int i = 0; i <n ;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i = 1; i < n; i++){
            arr[i] = arr[i+1];
            n=n-1;
        }
        System.out.println();
        System.out.println("After Deletion :");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
