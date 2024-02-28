package Array_Program;
import java .util.Scanner;
class merge{
    void sorting(int arr[],int s,int mid,int e){
        int arr3[]=new int[s+e];
        mid=s+(e-s)/2;
        int i=s,j=mid+1,k=s;
        while(i<=mid&&j<=e){
            if(arr[i]>arr[j]){
                arr3[k++]=arr[i++];
            }
            else{
                arr3[k++]=arr[j++];
            }
        }
        while(i<=mid){
            arr3[k++]=arr[i++];
        }
        while(j<=e){
            arr3[k++]=arr[j++];
        }
    }
}
public class MergeSort {
    
}
