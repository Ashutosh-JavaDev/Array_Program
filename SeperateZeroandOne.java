//Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.  
package Array_Program;

import java.util.*;

public class SeperateZeroandOne {
    public static void Seperate(int arr[], int size) {
        int seperatenumber = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[seperatenumber];
                arr[seperatenumber] = temp;
                seperatenumber++;
            }
        }
        System.out.println("Array After Seperating");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in array, only 1 and 0");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i == 1; i++) {
            if (arr[i] == 0 || arr[i] == 1) {
                Seperate(arr, size);
            } else {
                System.out.println("Put only 0 and 1 in the Array");
            }
        }
    }
}
