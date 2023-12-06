//Write a Java program to calculate the average value of array elements.
package Array_Program;
import java.util.*;
public class averageOfArray {
    public static float Average(int arr[],int size){
        float sum=0,average=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        average=sum/size;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for find the total sum value");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Numbers");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        float output=Average(arr, size);
        System.out.println("Average of the Given Numbers:       "+output);
    }
}
