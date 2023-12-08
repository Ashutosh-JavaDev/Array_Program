//Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers. 
package Array_Program;
import java.util.*;
public class putEvenFirst {
    public static void EvenFirst(int arr[],int size){
        int position=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[position];
                arr[position]=temp;
                position++;
            }
        }
        System.out.println("Array after Positioning Even and Odd");
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
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        EvenFirst(arr, size);
    }
}
