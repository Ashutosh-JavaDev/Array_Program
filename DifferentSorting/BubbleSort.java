package Array_Program.DifferentSorting;
import java.util.Scanner;
class BubSort{
    void bubsort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size-i-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("ArrayAfter Sort");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class BubbleSort {
    
}
