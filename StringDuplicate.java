package Array_Program;
import java.util.*;
public class StringDuplicate {
    public static void result(String arr[], int size) {
        System.out.println("Duplicate Strings");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        String arr[]=new String[size];
        sc.nextLine();
        System.out.println("Enter Some Words to find the Duplicates");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
        result(arr, size);
    }
}
