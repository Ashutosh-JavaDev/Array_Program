package Array_Program;

import java.util.Scanner;

class merge {
    void sorting(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int j = mid + 1, i = s, k = 0;
        // int k[]=new int[e+1];
        while (i <= mid && j <= e) {
            if (arr[i] > arr[j]) {
                arr[k] = arr[i];
                i++;
                k++;
            } else {
                arr[k] = arr[j];
                j++;
                k++;
            }
        }
    }
}

public class mergeSort {

}
