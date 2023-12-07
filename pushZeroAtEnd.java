package Array_Program;

import java.util.*;

public class pushZeroAtEnd {
    public static void nonZero(int arr[], int size) {
        int nonzeroIndex = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonzeroIndex];
                arr[nonzeroIndex] = temp;
                nonzeroIndex++;
            }
        }
        System.out.println("Seperating Zero and NonZero");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value int the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        nonZero(arr, size);

    }
}
