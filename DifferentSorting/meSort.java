package Array_Program.DifferentSorting;

import java.util.Scanner;

class meRging {
    void mErge(int arr[], int s,int mid, int e) {
        int mergeArray[] = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while (i <= mid && j <= e) {
            if(arr[i]<arr[j]){
                mergeArray[k]=arr[i];
                i++;
            }
            else{
                mergeArray[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            mergeArray[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            mergeArray[k]=arr[j];
            j++;
            k++;
        }
        for(i=0,j=s;i<mergeArray.length;i++,j++){
            arr[j]=mergeArray[i];
        }
    }
    void recursiveSort(int arr[],int s,int e){
        if(s<e){
            int mid=s+(e-s)/2;
            recursiveSort(arr, s, mid);
            recursiveSort(arr, mid+1, e);
            mErge(arr,s,mid,e);
        }
    }
}

public class meSort {
public static void main(String[] args) {
    meRging ob=new meRging();
    int arr[]={2,1,3,54,21};
    int num=arr.length;
    ob.recursiveSort(arr, 0,num-1);
    System.out.println("Array After Sort");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
