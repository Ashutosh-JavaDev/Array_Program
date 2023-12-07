package Array_Program;

import java.util.*;

public class commonBetweenThreeSorted {
    public static void checkElewment(int arr1[],int arr2[],int arr3[],int size){
        int count=0;
        System.out.println("Common Element:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int l=0;l<size;l++){
                    if(arr1[i]==arr2[j] && arr1[i]==arr3[l] && arr2[j]==arr3[l]){
                        System.out.println(arr1[i]);
                        count++;
                    }
                }
            }
        }
        if(count==0){
            System.out.println("No common Element Found");
        }
    }
    public static void takingInput(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        takingInput(arr1, size);
        // sortedArray(arr1, size);
        int arr2[]=new int[size];
        takingInput(arr2, size);
        // sortedArray(arr2, size);
        int arr3[]=new int [size];
        takingInput(arr3, size);
        // sortedArray(arr3, size);
        checkElewment(arr1, arr2, arr3, size);

    }
}
