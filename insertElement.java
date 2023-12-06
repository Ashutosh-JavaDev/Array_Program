//Write a Java program to insert an element (specific position) into an array.
package Array_Program;

import java.util.*;

public class insertElement {
    public static void result(int arr[], int index, int size, int number) {
        if (index <= size) {
            for (int i = index; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            arr[index] = number;
            System.out.println("New Array");
            for (int i = 0; i < size + 1; i++) {
                System.out.println(arr[i]);
            }

        } else {
            System.out.println("Invalid Index:Index Size is more than original size.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number want to add");
        int number = sc.nextInt();
        System.out.println("Enter the index wheere the number wants to add ");
        int index = sc.nextInt();
        result(arr, index, size, number);
    }
}
