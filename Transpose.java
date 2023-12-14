package Array_Program;
import java.util.*;
public class Transpose {
    public static void transpose(int arr[][],int size){
        System.out.println("Array Of Transpose Matrix");
        for(int i=0;i<size;i++){
           for(int j=0;j<size;j++){
            System.out.print(arr[j][i]+" ");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Row and Column");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
            arr[i][j]=sc.nextInt();
          }
        }
        transpose(arr, size);
    }
}
