package Array_Program;

import java.util.*;

public class BubbleSort {
    public static void sorting(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size - i - 1; j++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizee of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sorting(arr, size);
    }
}
