package Array_Program;

import java.util.*;

public class insertElement {
    public static void result(int arr[], int index, int size, int number) {
        if (index >= 0 && index <= size) {
            // Shift elements to the right to make space for the new element
            for (int i = size - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            // Insert the new element at the specified index
            arr[index] = number;

            System.out.println("New Array");
            for (int i = 0; i < size + 1; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid Index: Index should be between 0 and " + size);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number you want to add");
        int number = sc.nextInt();
        System.out.println("Enter the index where the number should be added");
        int index = sc.nextInt();
        result(arr, index, size, number);
    }
}
