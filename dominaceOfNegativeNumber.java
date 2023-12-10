//Write a Java program that checks whether an array is negative dominant or not.
package Array_Program;
import java.util.*;
public class dominaceOfNegativeNumber {
    public static boolean check(int arr[],int size){
        boolean result=false;
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                count++;
            }
        }
        if((count)>(size/2)){
            result=true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the valuer in the arra");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean answer=check(arr, size);
        System.out.println("Answer:"+answer);
    }
}
