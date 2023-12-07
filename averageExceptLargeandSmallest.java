//Write a Java program to compute the average value of an array of integers except the largest and smallest values.
package Array_Program;

import java.util.*;

public class averageExceptLargeandSmallest {
    public static float average(int arr[], int size) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]!=max && arr[i]!=min){
                sum+=arr[i];
            }
        }
        avg=sum/size;

        return avg;
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
        float answer=average(arr, size);
        System.out.println("Average after removing Maximum ans Minimum Number:"+answer);
    }
}
