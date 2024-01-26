package Array_Program;

import java.util.Scanner;

class twoMergeArray {
    void mergeTwoArray(int arr1[], int arr2[], int size1, int size2, int arr3[]) {
        int total = size1 + size2;
        arr3 = new int[total];
        int k = 0;
        for (int i = 0; i < size1; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int j = 0; j < size2; j++) {
            arr3[k] = arr2[j];
            k++;
        }

        // System.out.println("Third Array Value");
        // for (int i = 0; i < total; i++) {
        // System.out.println(arr3[i]);
        // }
        int sum = 0,s=0,l=total-1;
        float avg = 0;
        if (total % 2 != 0) {
            for (int i = 0; i < total; i++) {
                sum = sum + arr3[i];
            }

            avg = sum / total;
            System.out.println("Average:    "+avg);
        }
        else{
            int mid=s+(l-s)/2;
            float mead=(float)(arr3[mid]+arr3[mid+1])/2.0f;
            System.out.println(arr3[mid]+"+"+arr3[mid+1]+" = "+mead);

            
        }
    }
}

public class mergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        twoMergeArray ob = new twoMergeArray();
        System.out.println("Enter Size of the Array 1");
        int size1 = sc.nextInt();
        System.out.println("Enter the Size of the Second Array");
        int size2 = sc.nextInt();
        int total = size1 + size2;
        int arr1[] = new int[size1];
        System.out.println("Enter Elements in Array 1");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[size2];
        System.out.println("Enter Elements in Array 2");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[total];

        ob.mergeTwoArray(arr1, arr2, size1, size2, arr3);
    }
}
