package Array_Program;
import java.util.*;

public class PrimeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[][] = new int[size][size]; 
        
        // Input values into the array
        System.out.println("Enter the values for the array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Check and print prime numbers in the array
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
