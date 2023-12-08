//Write a Java program to arrange the elements of an array of integers so that all positive integers appear before all negative integers.
package Array_Program;
import  java.util.*;
public class PositiveNegative {
    public static void posNeg(int arr[],int size){
        int position=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i]=arr[position];
                arr[position]=temp;
                position++;
            }
        }
        System.out.println("Array After Taking all positive Number to the first");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        posNeg(arr, size);
    }
}
