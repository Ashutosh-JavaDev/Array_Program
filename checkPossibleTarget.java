package Array_Program;
import java.util.Scanner;
class SumTarget{
    boolean targetSum(int arr[],int target,int size){
        boolean result=false;
       if(target<0){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]!=arr[j] && i!=j){
                    System.out.println("arr["+i+"]+arr["+j+"]="+arr[i]+arr[j]);
                }
            }
        }
       }
        return result;

    }
}public class checkPossibleTarget {
    
}
