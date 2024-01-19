package Array_Program.DifferentSorting;
import java.util.Scanner;
class mergeSort{
    void logicMerge(int arr[],int s,int mid,int e){
        mid=s+(e-s)/2;
        int i=0,j=mid+1,k=0;
        int merge[]=new int[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i]>arr[j]){
                arr[k]=arr[i];
                k++;
                i++;
            }
            else{
                arr[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            arr[k]=arr[i];
            k++;i++;
        }

        while(j<=e){
            arr[k]=arr[j];
            k++;j++;
        }
    }
}
public class MergeSort {
    
}
