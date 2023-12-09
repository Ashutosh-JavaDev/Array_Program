//Write a Java program to find the minimum subarray sum of specified size in a given array of integers.  
package Array_Program;

import java.util.*;

public class askingSizeSum {
    public static int sizeSum(int arr[], int size, int sizeSum) {
        int sum = 0;
        for (int i = 0; i < sizeSum; i++) {
            sum = sum + arr[i];
        }
        return sum;

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
        System.out.println("Enter the size value till the sum want to print");
        int sizeSum=sc.nextInt();
        int output=sizeSum(arr, size,sizeSum);
        System.out.println("Answer:"+output);
    }
}
