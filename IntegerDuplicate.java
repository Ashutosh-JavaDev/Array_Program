//Write a Java program to find duplicate values in an array of integer values.
package Array_Program;
import java.util.*;
public class IntegerDuplicate {
    public static void duplicateNumber(int arr[],int size){
        int count=0;
        System.out.println("Duplicate number:");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.print(arr[i]+" ");
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("\n"+count+" Duplicate Number Found");
        }
        else{
            System.out.println("No Duplicate Number Found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Number in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        duplicateNumber(arr, size);
    }
}
