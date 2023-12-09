//Write a Java program to find all triplets equal to a given sum in an unsorted array of integers.  
package Array_Program;
import java.util.*;
public class tripletSum {
    public static void triplet(int arr[],int size,int number){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                    if((arr[i]+arr[j]+arr[k])==number){
                        
                    }
                }
            }
        }
    }
}
