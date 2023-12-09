//Write a Java program to find all triplets equal to a given sum in an unsorted array of integers.  
package Array_Program;
import java.util.*;
public class tripletSum {
    public static void triplet(int arr[],int size,int number){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                    if((arr[i]+arr[j]+arr[k])==number){
                        System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+number);
                        count++;
                    }
                }
            }
        }
        if(count==0){
            System.out.println("No Perfect sum found for the Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number want to find the sum");
        int number=sc.nextInt();
        triplet(arr, size, number);
    }
}
