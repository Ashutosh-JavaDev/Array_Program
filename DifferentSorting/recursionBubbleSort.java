package Array_Program.DifferentSorting;

import java.util.Scanner;

class sorted {
    void makeArraySort(int arr[], int i, int j, int size) {
        if (i >= size - 1) {
            return;
        } else if (j < size - i - 1) {
            int temp = arr[j];
            arr[i] = arr[j + 1];
            arr[j + 1] = temp;
            makeArraySort(arr, i, j + 1, size);

        } else {
            makeArraySort(arr, i + 1, j, size);
        }
    }
}

public class recursionBubbleSort {

}
