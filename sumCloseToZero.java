//Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.  
package Array_Program;

import java.util.*;

public class sumCloseToZero {
    public static void check(int arr[], int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) > -3 || (arr[i] + arr[j]) < 3) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
                    count++;
                    break;
                } else if ((arr[i] + arr[j]) == 0) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + 0);

                }
            }
        }
        if (count == 0) {
            System.out.println("Answer is far from zero");
        } else {
            System.out.println("Number is closer to zero");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array in negative and posetive way");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        check(arr, size);
    }
}
