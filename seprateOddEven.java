package Array_Program;
import java.util.*;
public class seprateOddEven {
    public static void result(int arr[],int size){
        int number=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[number];
                arr[number]=temp;
                number++;
            }
        }
        System.out.println("Array After Seprating Even and Odd Number");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
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
        result(arr, size);
    }
}
