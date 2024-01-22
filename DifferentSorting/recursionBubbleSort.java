package Array_Program.DifferentSorting;

import java.util.Scanner;

class sorted {
    void makeArraySort(int arr[], int i, int j, int size) {
        if (i >= size - 1) {
            return;
        } else if (j < size - i - 1) {
            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[i] = arr[j + 1];
                arr[j + 1] = temp;
            }
            makeArraySort(arr, i, j + 1, size);

        } else {
            makeArraySort(arr, i + 1, j, size);
        }
    }
}

public class recursionBubbleSort {
    public static void main(String[] args) {
        sorted ob = new sorted();
        int arr[] = { 3, 5, 1, 2, 6, 21, 12 };
        ob.makeArraySort(arr, 0, 0, arr.length-1);
        System.out.println("Array After Sort");
        for(int i=0;i<arr.length;i++){
            
        }
    }
}
