//Write a Java program to get the difference between the largest and smallest values in an array of integers.
package Array_Program;

import java.util.*;

public class differenceBetweenLargestandSmallest {
    public static void Difference(int arr[], int size) {
        int max = arr[0];
        int secmax = arr[1];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
        }
    }
}
