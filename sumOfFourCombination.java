package Array_Program;
import java.util.*;
public class sumOfFourCombination {
    public static void combination(int arr[],int size,int target){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;j<size;k++){
                    for(int l=k+1;l<size;l++){
                        if((arr[i]+arr[j]+arr[k]+arr[l])==target){
                            System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" + "+arr[l]+" = "+target);
                            count++;
                        }
                    }
                }
            }
        }
        if(count==0){
            System.out.println("No Perfect Number Found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Number in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value in the Array");
        int target=sc.nextInt();
        combination(arr, size, target);
    }
}
