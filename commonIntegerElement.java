package Array_Program;
import java.util.*;
public class commonIntegerElement {
    public static void firstArray(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in first Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void secondArray(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in second Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void CommonElement(int arr1[],int arr2[],int size){
        int count=0;
        System.out.print("Common Element between Two Array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(" "+arr1[i]);
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println(" "+",No Common Element found");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        firstArray(arr1,size);
        int arr2[]=new int[size];
        secondArray(arr2,size);
        CommonElement(arr1,arr2,size);
    }
}
