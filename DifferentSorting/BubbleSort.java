package Array_Program.DifferentSorting;
import java.util.Scanner;
class BubSort{
    void bubsort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[i]<arr[i+1]){
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BubSort ob=new BubSort();
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter The VAlue in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ob.bubsort(arr, size);

    }
}
