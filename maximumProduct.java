//Write a Java program to find the maximum product of two integers in a given array of integers.  
package Array_Program;
import java.util.*;
public class maximumProduct {
    public static void maximuxPro(int arr[],int size){
        int max=arr[0];
        int secmax=arr[1];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
        }
        System.out.println("Maximum Product:"+secmax+" * "+max+" = "+(secmax*max));
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
        maximuxPro(arr, size);  
    }
}
