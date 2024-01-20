package Array_Program.DifferentSorting;

import java.util.Scanner;

class meRGing {
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

public class MergeSort {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    meRGing ob=new meRGing();
    System.out.println("Enter The size of the Array");
    int size=sc.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter The Value int Array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    ob.recursiveSort(arr, 0,size-1);
    System.out.println("Array After Sort");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
