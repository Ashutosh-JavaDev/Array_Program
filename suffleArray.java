//Write a Java program to shuffle a given array of integers.  
package Array_Program;
import java.util.*;
public class suffleArray {
    public static void shuffle(int arr[],int size){
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]<25){
                int temp=arr[i+1];
                arr[i+1]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
        System.out.println("Shuffle Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
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
        shuffle(arr, size);
    }
}
