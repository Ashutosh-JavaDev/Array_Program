package Array_Program;

import java.util.*;

public class TotalPercentage {
    public static void total(int arr[], int size) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        float Average = total / size;
        System.out.println("Total:  " + total);
        System.out.println("Percentage: " + Average);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Subject of  the Array");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        total(arr, size);
    }
}
