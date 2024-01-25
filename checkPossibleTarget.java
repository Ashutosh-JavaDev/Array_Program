package Array_Program;
import java.util.Scanner;
class SumTarget{
    boolean targetSum(int arr[],int target,int size){
        boolean result=false;
       if(target>0){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                // if(arr[i]!=arr[j] && i!=j){
                   if(arr[i]+arr[j]==target){
                    result=true;
                    System.out.println("arr["+i+"]+arr["+j+"]="+target);
                   }
                // }
            }
        }
       }
        return result;

    }
}
public class checkPossibleTarget {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    SumTarget ob=new SumTarget();
    System.out.println("Enter the Size of the Array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the Value in the Array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }    
    boolean res=ob.targetSum(arr, 10, size);
    System.out.println("Result: "+res);

 }   
}
