package Array_Program;

import java.util.*;

public class addTowMatrix {
    public static void matrixOne(int row, int col, int arr[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number like Two Dimensional Form");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Matrix two
    public static void martixTwo(int row, int col, int arr[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number like Two Dimensional Form");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    // Sum
    public static void Outputsum(int arr1[][],int arr2[][],int row,int col){
         int arr3[][]=new int[row][col];;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers of row");
        int row=sc.nextInt();
        System.out.println("Enter the Number of column");
        int col=sc.nextInt();
        int arr1[][]=new int[row][col];
        matrixOne(row, col, arr1);
        int  arr2[][]=new int[row][col];
        martixTwo(row, col, arr2);
        Outputsum(arr1, arr2, row, col);
    }
}
