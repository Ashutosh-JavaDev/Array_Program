package Array_Program;

import java.util.Scanner;

class merge {
    void sorting(int arr[], int s,int mid, int e) {
         mid = s + (e - s) / 2;
        int j = mid + 1, i = s,k=0;
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
        while (i < mid) {
            arr[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            arr[k] = arr[j];
            j++;
            k++;
        }
        System.out.println("Array After sorting");
        for(int l=0;l<e;l++){
            System.out.println(arr[l]);
        }
    }
    void mergesort(int arr[],int s,int e){
        if(s<e){
            int mid=s+(e+s)/2;
            mergesort(arr, mid+1, e);
            sorting(arr, s,mid, e);
        }
    }
}

public class mergeSort {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of the Array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the Value in the Array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }    
    merge ob=new merge();
    ob.mergesort(arr, 0, size-1);

}
}
