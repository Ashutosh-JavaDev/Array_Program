package Array_Program.DifferentSorting;
import java.util.Scanner;
class mergeSort{
    void logicMerge(int arr[],int s,int mid,int e){
        mid=s+(e-s)/2;
        int i=0,j=mid+1,k=0;
        int merge[]=new int[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i]>arr[j]){
                merge[k]=arr[i];
                k++;
                i++;
            }
            else{
                merge[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            merge[k]=arr[i];
            k++;i++;
        }

        while(j<=e){
            merge[k]=arr[j];
            k++;j++;
        }
        for(i=0,j=s;i<merge.length;i++){
            
        }

    }
}
public class MergeSort {
    
}
