//Write a Java program to reverse an array of integer values.
package Array_Program;

import java.util.*;

public class reverseArray {
    public static void reverse(int arr[], int size) {
        System.out.println("Reverse Array");
        for (int i = size-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, size);
    }
}
