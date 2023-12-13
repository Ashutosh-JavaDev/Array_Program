//WAP to find the Missing NUMBER IN Java.
package Array_Program;

import java.util.*;

public class missingNumber {
    public static int Missing(int arr[], int size) {
        int sum = 0;
        int total_number=arr.length;
        int temp = total_number * ((total_number + 1) / 2);
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        int newNumber = temp - sum;
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int Answer=Missing(arr,size);
        System.out.println("Missing  Number:"+Answer);

    }
}
