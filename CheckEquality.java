package Array_Program;
import java.util.*;
public class CheckEquality {
    public static void Equality(int arr1[],int arr2[],int size){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr1[i]==arr2[j] && i==j){
                    count++;
                }
            }
        }
        if(count==size){
            System.out.println("Both Array Are Equal");
        }
        else{
            System.out.println("Both Array's value are Different");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the value in First Array");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[size];
        System.out.println("Enter the value in second Array");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        Equality(arr1, arr2, size);
    }
}
