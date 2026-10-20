package dsa_with_java.Array;

public class UpdateMethod {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        System.out.println("Before Insertion : ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("After Insertion : ");
        arr[2] = 15;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
