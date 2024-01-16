package Array_Program;

import java.util.Scanner;

class Merge {
    void sorting(int arr[], int s, int mid, int e) {
        // Corrected calculation of n1 and n2
        int n1 = mid - s + 1;
        int n2 = e - mid;
        
        // Corrected array sizes and initialization
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        // Populating arr1 and arr2
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[s + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid + 1 + i];
        }

        // Merging the two arrays
        int i = 0, j = 0, k = s;
        while (i < n1 && j < n2) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of arr1 and arr2, if any
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            // Recursive calls for left and right halves
            mergeSort(arr, s, mid);
            mergeSort(arr, mid + 1, e);
            // Merge the sorted halves
            sorting(arr, s, mid, e);
        }
    }
}

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Values in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Merge ob = new Merge();
        ob.mergeSort(arr, 0, size - 1);
        System.out.println("Array After sorting");
        for (int l = 0; l < size; l++) {
            System.out.println(arr[l]);
        }
    }
}
