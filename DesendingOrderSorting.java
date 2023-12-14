package Array_Program;
import java.util.*;
public class DesendingOrderSorting {
    public static void sorting(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Arrays  in descending");
        for(int i=0;i<size;i++){
            System.out.println( arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr, size);

    }
}
