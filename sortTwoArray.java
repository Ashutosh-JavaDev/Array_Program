package Array_Program;

import java.util.*;

public class sortTwoArray {
    public static void sorted(int arr1[], int arr2[], int size1, int size2) {
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                }
            }
        }
        System.out.println("Array after sort");
        for (int i = 0; i < size1; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Second Array After Sort");
        for (int j = 0; j < size2; j++) {
            System.out.println(arr2[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first Array");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the value in the first Array");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of Second Array");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the value in the first Array");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        sorted(arr1, arr2, size1, size2);

    }
}
