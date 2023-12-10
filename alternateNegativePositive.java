//Write a Java program that checks whether an array of integers alternates between positive and negative values.  
package Array_Program;
import java.util.*;
public class alternateNegativePositive {
    public static boolean check(int arr[],int size){
        int count=0;
        boolean result=true;
        for(int i=0;i<size;i++){
            if((arr[i]<0) && i%2==0){
                result=false;
                count++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("{enter the size of the Array");
          int size=sc.nextInt();
          int arr[]=new int[size];
          System.out.println("Enter the value in the Array");
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
          boolean output=check(arr, size);
          System.out.println("Answer:"+output);
    }
}
