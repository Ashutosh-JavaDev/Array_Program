//Write a Java program to find the maximum and minimum value of an array.
package Array_Program;
import java.util.*;
public class Maximun_Minimun {
  public static void Result(int arr[],int size){
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Max:    "+max);
    System.out.println("Min:    "+min);
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size for the array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("ENter the value");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    Result(arr, size);
  }
}
