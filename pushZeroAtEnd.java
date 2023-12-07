package Array_Program;

import java.util.*;

public class pushZeroAtEnd {
    public static void nonZero(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void zero(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value int the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Seperating Zero and NonZero");
        nonZero(arr, size);
        zero(arr, size);

    }
}
