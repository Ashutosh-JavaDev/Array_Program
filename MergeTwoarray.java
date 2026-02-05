package Array_Program;

import java.util.Arrays;

class mergenumber {
    public float mergetwo(int arr1[], int size1, int arr2[], int size2) {
        int size = arr1.length + arr2.length;
      

        int newArr[] = new int[size];
        int i = 0, j = 0, l = 0;
        while (i < arr1.length) {
            newArr[j] = arr1[i];
            i++;
            j++;
        }
        while (l < arr2.length) {
            newArr[j] = arr2[l];
            l++;
            j++;
        }
        Arrays.sort(newArr);
        float mid = 0;
        if (size % 2 != 0) {
            mid = newArr[size / 2];
        }
        else{
           int temp=size/2;
           temp-=1;
         
           System.out.print(newArr[temp]+" "+newArr[temp+1] );

            mid=newArr[size/2]+newArr[temp+1];
            mid/=2;
        }
        return mid;
    }
}

public class MergeTwoarray {
    public static void main(String[] args) {
        mergenumber m = new mergenumber();
        int arr1[] = {1,2 };
        int arr2[] = { 3,4 };
        float mid = m.mergetwo(arr1, arr1.length, arr2, arr2.length);
        System.out.println(mid);
    }
}