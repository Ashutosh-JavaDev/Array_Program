//Write a Java program to determine whether numbers in an array can be rearranged so that each number appears exactly once in a consecutive list of numbers.
package Array_Program;
import java.util.*;
public class checkIfNotDuplicate {
    public static boolean checkDuplicate(int arr[],int size){
        boolean result=true;
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    
                }
            }
        }
        return result;
    }
}
