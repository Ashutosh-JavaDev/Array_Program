package Array_Program;
import java.util.*;
public class PrimeMatrix {
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[][]=new int[size][size]; 
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]%i==0){
                    count++;
                }
                if(count==2){
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
