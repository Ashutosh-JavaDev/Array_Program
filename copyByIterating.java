//Write a Java program to copy an array by iterating the array.

package Array_Program;
import java.util.Scanner;
import java.util.Arrays;
public class copyByIterating {
    public static void takinginput(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void result(int arr[],int size){
        int newarray[]=new int[size];
        System.out.println("Original Array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Copied Array: ");
        for(int i=0;i<size;i++){
            newarray[i]=arr[i];
        }
        System.out.println(Arrays.toString(newarray));
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int  size=sc.nextInt();
         int arr[]=new int[size];
         takinginput(arr, size);
         result(arr, size);
    }
}
