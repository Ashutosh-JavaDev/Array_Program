package Array_Program;
import java.util.*;
public class DesendingOrderSorting {
    public static void sorting(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<i-1;j++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("Arrays  in descending");
        for(int)
    }
}
