package Array_Program;
import java.util.*;
public class MathSq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double result=Math.sqrt(Math.pow(a, b));
        System.out.println("Result:     "+String.format("%.2f", result));
    }
}
