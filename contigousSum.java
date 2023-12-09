//Write a Java program to find a contiguous subarray within a given array of integers with the largest sum.
package Array_Program;
import java.util.*;
public class contigousSum {
    public static int Contigous(int arr[],int size){
        int current_Sum=0;
        int max_Sum=0;
        for(int i=0;i<size;i++){
            current_Sum+=arr[i];
            if(current_Sum>max_Sum){
                max_Sum=current_Sum;
            }
            if(current_Sum<0){
                current_Sum=0;
            }
        }
        return max_Sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int output=Contigous(arr, size);
        System.out.println("Contigous Array Sum:"+output);
    }
}
