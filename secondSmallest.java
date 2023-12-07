package Array_Program;

import java.util.*;

public class secondSmallest {
    public static void secondSmallestNumber(int arr[], int size) {
        int min = arr[0];
        int secmin = arr[1];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            }
        }
        System.out.println("Min:" + min);
        System.out.println("Second Smallest:" + secmin);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        secondSmallestNumber(arr, size);
    }
}
