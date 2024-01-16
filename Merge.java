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
    void recursivesort(int arr[],int s,int e){
        if(s<e){
            int mid=s+(e-s)/2;
            recursivesort(arr, s, e);
            recursivesort(arr, mid+1, e);
            mergesort(arr, s, mid, e);
        }
    }
}
public class Merge {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,5,23,21};
        int n=arr.length;
        sorting ob=new sorting();
        ob.recursivesort(arr, 0, n-1);
    }   
}
