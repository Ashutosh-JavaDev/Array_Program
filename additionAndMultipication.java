package Array_Program;

import java.util.*;

public class additionAndMultipication {
    public static  int Addition(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static  int Multiply(int arr[],int size){
        int pro=1;
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                pro=pro*arr[i];
            }
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
    System.out.println("Enter the value in the Array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int total=Addition(arr, size);
    System.out.println("Addition of Even Number: "+total);
    int product=Multiply(arr, size);
    System.out.println("Product Of Odd Numbber: "+product);

    }
}
