package dsa_with_java.Array;

public class InsertionMethod {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,0};
        for (int i = 3 ;  i > 1; i--){
            arr[i+1] = arr[i];
        }
        System.out.println("This is a after intertion :");
        arr[2] = 100;
        for (int x : arr){
            System.out.println(x);
        }
    }
}
