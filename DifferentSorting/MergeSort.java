package Array_Program.DifferentSorting;

import java.util.Scanner;

class mSort {
    void logicMerge(int arr[], int s, int mid, int e) {
        mid = s + (e - s) / 2;
        int i = 0, j = mid + 1, k = 0;
        int merge[] = new int[e - s + 1];
        while (i <= mid && j <= e) {
            if (arr[i] > arr[j]) {
                merge[k] = arr[i];
                k++;
                i++;
            } else {
                merge[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            merge[k] = arr[i];
            k++;
            i++;
        }

        while (j <= e) {
            merge[k] = arr[j];
            k++;
            j++;
        }
        for (i = 0, j = s; i < merge.length; i++,j++) {
            arr[j] = merge[i];
        }
    }

    void mergeSorting(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            mergeSorting(arr, s, mid);
            mergeSorting(arr, mid + 1, e);
            logicMerge(arr, s, mid, e);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mSort ob = new mSort();
        System.out.println("Enter the  Size of  the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter The Number In the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ob.mergeSorting(arr,0,size-1);
        System.out.println("Array After Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
