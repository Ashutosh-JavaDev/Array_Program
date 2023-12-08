package Array_Program;

import java.util.*;

public class Leader {
    public static void check(int arr[], int size) {
        System.out.println("Output:");
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }

            }
            if (j == size) {
                System.out.println(arr[i] + " ");
            }
        }
        // System.out.println("Majoriry Element:"+temp);
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
        check(arr, size);
    }
}
