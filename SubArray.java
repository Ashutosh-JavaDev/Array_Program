//Write a Java program to check if a given array contains a subarray with 0 sum. 
package Array_Program;
import java.util.*;
public class SubArray {
    public static boolean subArray(int arr[],int size){
        boolean result=true;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]+arr[i])==0){
                    result=true;
                }
                else{
                    result=false;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Posetive and negative Number to check the program");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean answer=subArray(arr, size);
        System.out.println("Does the said array contain a subarray with 0 sum:"+answer);
    }
}
