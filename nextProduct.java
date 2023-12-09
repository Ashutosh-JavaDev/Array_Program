//Write a Java program to replace each element of the array with the product of every other element in a given array of integers.  
package Array_Program;

import java.util.*;

public class nextProduct {
    public static void productNext(int arr[], int size) {
        int totalProduct = 1;

        // Calculate the product of all elements
        for (int i = 0; i < size; i++) {
            totalProduct *= arr[i];
        }

        System.out.println("The Product after next Number");

        // Print the product of every other element
        for (int i = 0; i < size; i++) {
            System.out.print(totalProduct / arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the values in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        productNext(arr, size);
    }
}

