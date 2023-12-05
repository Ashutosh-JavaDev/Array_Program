//Write a Java program to sum values of an array.
package Array_Program;
import java.util.*;
public class sumOfArray {
    public static int sumOfNumber(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for the Total sum");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int output=sumOfNumber(arr, size);
        System.out.println("Total sum:  "+output);
    }
}
