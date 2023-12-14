package Array_Program;
import java.util.*;
public class countOddEven {
    public static void count(int arr[],int size){
        int even=0,odd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total Even Number:  "+even);
        System.out.println("Total Odd Number:   "+odd);
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        count(arr, size);
    }
}
