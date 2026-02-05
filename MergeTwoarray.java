package Array_Program;

import java.util.Arrays;

class mergenumber {
    public float mergetwo(int arr1[], int size1, int arr2[], int size2) {
        int size = arr1.length + arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

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
        System.out.println(size);
        for(int k=0;k<size;k++){
            System.out.print(newArr[k]+" ");
        }
        System.out.println();
        float mid = 0;
        if (size % 2 != 0) {
            mid = newArr[size / 2];
        }
        else{
           
            mid=arr1[arr1.length-1]+arr2[0];
            mid/=2;
        }
        return mid;
    }
}

public class MergeTwoarray {
    public static void main(String[] args) {
        mergenumber m = new mergenumber();
        int arr1[] = { 0,0,0,0,0 };
        int arr2[] = { -1,0,0,0,0,0,1 };
        float mid = m.mergetwo(arr1, arr1.length, arr2, arr2.length);
        System.out.println(mid);
    }
}