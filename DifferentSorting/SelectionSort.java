package Array_Program.DifferentSorting;
import java.util.Scanner;
class SecSort{
    void secSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SecSort ob=new SecSort();
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter The VAlue in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ob.secSort(arr, size);

    }
}
