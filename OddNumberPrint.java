package Array_Program;

import java.util.*;

public class OddNumberPrint {
    public static void OddOutput(int arr[], int size) {
        System.out.println("Odd Array element");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value  in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        OddOutput(arr, size);
    }
}
