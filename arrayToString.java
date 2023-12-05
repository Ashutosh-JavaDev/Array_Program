package Array_Program;

import java.util.*;

public class arrayToString {
    public static String Result(int arr[], int size) {
        String answer = Arrays.toString(arr);
        System.out.println("Original Array: "+answer);
        Arrays.sort(arr);
        String value = Arrays.toString(arr);
        return value;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your Value");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        String output = Result(arr, size);
        System.out.println("Sorted Value : " + output);
    }
}