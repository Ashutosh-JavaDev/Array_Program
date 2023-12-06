//Write a Java program to find the index of an array element.
package Array_Program;
import java.util.*;
public class IndexOfArrayElement {
    public static void Result(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println("arr["+(i+1)+"] = "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Result(arr, size);
    }
}
