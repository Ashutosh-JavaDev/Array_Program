//checkArrayContains0and-1
package Array_Program;
import java.util.*;
public class ArrayContainsnegativenumber {
    public static boolean check(int arr[],int size){
        boolean result=false;
        for(int i=0;i<size;i++){
            if(arr[i]==0 &&arr[i]==-1){
                result=true;
            }
            else{
                result=false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean answer=check(arr, size);
        System.out.println("Result:"+answer);

    }
    
}
