package Array_Program;
import java.util.*;
public class CommonStringElement {
    public static void firstArray(String arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in first Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
    }
    public static void secondArray(String arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in second Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
    }
    public static void CommonElement(String arr1[],String arr2[],int size){
        int count=0;
        System.out.println("Common Element between Two Array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.println(arr1[i]);
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
        String arr1[]=new String[size];
        firstArray(arr1,size);
        String arr2[]=new String[size];
        secondArray(arr2,size);
        CommonElement(arr1,arr2,size);
    }
}
