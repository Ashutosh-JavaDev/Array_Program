package Array_Program;
import java.util.Scanner;
class cubeAr{
    int arr[];
    void cube(){
        Scanner sc=new Scanner(System.in);
        arr=new int[10];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        // int temp;
        System.out.println("Cubic Array");
        for(int i=0;i<10;i++){
            // temp=(arr[i]*arr[i]*arr[i]);
            System.out.print(arr[i]*arr[i]*arr[i]+" ");
        }
    }
}
public class cubicArray {
    public static void main(String[] args) {
        cubeAr ob=new cubeAr();
        ob.cube();
    }
}
