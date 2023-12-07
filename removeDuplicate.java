package Array_Program;

import java.util.*;

public class removeDuplicate {
    public static void DuplicateRemove(int arr[], int size) {
        int count = 0, temp = arr[0];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    temp = arr[i];
                    System.out.println("Duplicate: " + arr[i]);
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Array After Removing the Duplicates");
            for (int i = 0; i < size; i++) {
                if (arr[i] != temp) {
                    System.out.println(arr[i]);
                }
            }
        } else {
            System.out.println("No Duplicates Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        DuplicateRemove(arr, size);
    }
}
