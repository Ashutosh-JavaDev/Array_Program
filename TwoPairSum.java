package Array_Program;

import java.util.*;

public class TwoPairSum {
    public static void SumofTwoPAir(int arr[], int number, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) == number) {
                    System.out.println("Number[" + arr[i] + "]+Number[" + arr[j] + "]= " + number);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No Equation found");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number whose equation wants to find");
        int Number = sc.nextInt();
        SumofTwoPAir(arr, Number, size);
    }
}
