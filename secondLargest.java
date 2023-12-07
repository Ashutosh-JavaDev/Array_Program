package Array_Program;

import java.util.*;

public class secondLargest {
    public static void secondMaximun(int arr[], int siz) {
        int max = arr[0];
        int secmax = arr[0];
        for (int i = 0; i < siz; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Second Max:" + secmax);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        secondMaximun(arr, size);
    }
}
