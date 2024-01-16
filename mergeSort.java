package Array_Program;

import java.util.Scanner;

class merge {
    void sorting(int arr[], int s, int mid, int e) {
       mid=s+(e-s)/2;
       int arr1[]=new int[mid+1];
        int arr2[]=new int[mid];
        int n1=mid+1;
        int n2=mid;
        for(int i=0;i<n1;i++){
            arr1[i]=arr[s];
            s++;
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[n1];
            n1++;
        }
        int i=0,j=0,k=0;
        while (i < n1 && j < n2) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
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

    void mergesort(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e + s) / 2;
            mergesort(arr, mid + 1, e);
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
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        merge ob = new merge();
        ob.mergesort(arr, 0, size - 1);
        System.out.println("Array After sorting");
        for (int l = 0; l < size; l++) {
            System.out.println(arr[l]);
        }
    }
}
