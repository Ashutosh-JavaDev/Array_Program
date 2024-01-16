package Array_Program;
import java.util.Scanner;
class sorting{
    void mergesort(int arr[],int s,int mid,int e){
        int arr1[]=new int[e-s+1];
        mid=s+(e-s)/2;
        int i=s,k=0,j=mid+1;
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                arr1[k]=arr[i];
                i++;k++;
            }
            else{
                arr1[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid){
            arr1[k]=arr[i];
            i++;k++;
        }
        while(j<=e){
            arr1[k]=arr[j];
            j++;
            k++;
        }
        for(i=0,j=s;i<arr1.length;i++,j++){
            arr[j]=arr1[i];
        }
    }
}
public class Merge {
    
}
