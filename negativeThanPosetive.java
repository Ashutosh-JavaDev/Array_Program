package Array_Program;
import java.util.*;
public class negativeThanPosetive {
    public static void NegativePosetive(int arr[],int size){
        int position=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[position];
                arr[position]=temp;
                position++;
            }
        }
        System.out.println("Array after Positioning Negative and Positive Integer");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Negative and Positive Number to check the Program");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        NegativePosetive(arr, size);
    }
}
