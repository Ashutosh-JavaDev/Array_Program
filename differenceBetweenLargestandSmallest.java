//Write a Java program to get the difference between the largest and smallest values in an array of integers.
package Array_Program;

import java.util.*;

public class differenceBetweenLargestandSmallest {
    public static int Difference(int arr[], int size) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max Number:" + max);
        System.out.println("Min Number:" + min);
        int difference = max - min;
        return difference;
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
        int answer = Difference(arr, size);
        System.out.println("Difference between Maximun and Second Maximun Number:" + answer);
    }
}
