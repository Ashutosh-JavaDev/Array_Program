//Write a Java program to test if an array contains a specific value.
package Array_Program;

import java.util.*;

public class ContainSpecificNunmber {
    public static void Result(int arr[], int number, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (number == arr[i]) {
                count++;
            }
        }
        if(count>0){
            System.out.println("Number is presemt in the array");
        }
        else{
            System.out.println("Number is not Found in the array");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value opf the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number want to check that preswent in the array or not");
        int number=sc.nextInt();
        Result(arr, number, size);
    }
}
