package Array_Program;
import java.util.Scanner;
class twoMergeArray{
    void mergeTwoArray(int arr1[],int arr2[],int size1,int size2,int arr3[]){
        int total=size1+size2;
        arr3=new int[total];
        int k=0;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(i<=size1){
                    arr3[k]=arr1[i];
                    k++;
                }
                else{
                    arr3[k]=arr2[j];
                    k++;
                }
            }
        }
        System.out.println("Third Array Value");
        for(int i=0;i<total;i++){
            System.out.println(arr3[i]);
        }
    }
}
public class mergeTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        twoMergeArray ob=new twoMergeArray();
    }
}
