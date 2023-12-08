package Array_Program;

import java.util.Scanner;

public class SubArray {
    public static boolean subArray(int arr[], int size) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) == 0) {
                    result = true;
                    break; // Added break to exit the inner loop once a pair is found
                }
            }
            if (result) {
                break; // Added break to exit the outer loop once a pair is found
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Positive and negative Numbers to check the program");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean answer = subArray(arr, size);
        System.out.println("Does the said array contain a subarray with 0 sum: " + answer);
    }
}
