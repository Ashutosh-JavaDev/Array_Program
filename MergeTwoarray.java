package Array_Program;

class mergenumber {
    public  void mergetwo(int arr1[], int size1, int arr2[], int size2) {
        int size = arr1.length + arr2.length;
        int newArr[] = new int[size];
        int i = 0, j = 0,l=0;
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
        for(int k=0;k<size;k++){
            System.out.print(newArr[k]+ " ");
        }
    }
}

public class MergeTwoarray {
   public static void main(String[] args) {
    mergenumber m=new mergenumber();
    int arr1[]={2,3,5,6};
    int arr2[]={1,4,7,8};
    m.mergetwo(arr1,arr1.length,arr2,arr2.length);
   }
}