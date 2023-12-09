//Write a Java program to find a contiguous subarray within a given array of integers with the largest sum.
package Array_Program;
import java.util.*;
public class contigousSum {
    public static int Contigous(int arr[],int size){
        int current_Sum=0;
        int max_Sum=0;
        for(int i=0;i<size;i++){
            if(current_Sum>max_Sum){
                max_Sum=current_Sum;
            }
            else{
                current_Sum=0;
            }
        }
        return max_Sum;
    }
}
