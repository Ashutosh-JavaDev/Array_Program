//Write a Java program to remove a specific element from an array.
package Array_Program;

import java.util.*;

public class removeElement {
    public static void remove(int arr[], int number, int size) {
        int temp = arr[0];
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (number == arr[i]) {
                temp = arr[i];
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Removed number: " + temp);
            System.out.println("New Array after removed number");
            for (int i = 0; i < size; i++) {
                if (arr[i] != temp) {
                    System.out.println(arr[i]);
                }
            }
        }
        else{
            System.out.println("Numbr is not in the array for remove that");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number want to remove");
        int number = sc.nextInt();
        remove(arr, number, size);
    }
}
