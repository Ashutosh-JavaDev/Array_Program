package Array_Program;
import java.util.*;
public class BinarySearch {
    public static void PrintSearch(int arr[],int size,int num){
        int first=0,mid=0,last=size-1,count=0;
        while(first<=last){
            mid=(first+last)/2;
            if(arr[mid]==num){
                count=mid+1;
                break;
            }
            else if(arr[mid]<num){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        if(count>0){
            System.out.println("Given Number Found in "+count+" Position");
        }
        else{
            System.out.println("Givenn Number Not Found");
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Number  want to be Search");
        int num=sc.nextInt();
        PrintSearch(arr, size, num);
    }
}
