package Array_Program;
import java .util.Scanner;
class merge{
    void sorting(int arr[],int s,int mid,int e){
        int arr3[]=new int[e-s+1];
        mid=s+(e-s)/2;
        int i=s,j=mid+1,k=0;
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
        for(int n=0,m=s;n<arr3.length;n++,m++){
            arr[m]=arr3[n];
        }
    }
    void mS(int arr[],int s,int e){
        if(s<e){
            int mid=s+(e-s)/2;
            mS(arr, s, mid);
            mS(arr, mid+1,e);
            sorting(arr, s, mid, e);
        }
    }
}
public class MergeSort {
    public static void main(String[] args) {
        merge ob=new merge();
        int arr[]={7,3,2,5,9,10};
        ob.mS(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
