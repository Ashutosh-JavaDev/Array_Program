package Array_Program;

class median {
    float mediansorted(int arr1[], int size1, int size2, int arr2[]) {
        int total = size1 + size2;
        int arr3[] = new int[total];
        int k = 0;
        for (int i = 0; i < size1; i++) {
            arr3[k] = arr1[i];

            for (int j = 0; j < size2; j++) {
                arr3[k + 1] = arr2[j];
            }
        }
        if (total % 2 != 0) {
            int sum = 0;
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size2; j++) {
                    sum = sum + (arr1[i] + arr2[j]);
                }
            }
            float Average = sum / total;
            return Average;
        } else {
            int s = 0, e = total;
            int mid = s + (e - s) / 2;
            float medan = (arr1[mid] + arr2[mid + 1]);
            return medan;
        }
    }
}

public class medianOfTwoSortedArray {
    public static void main(String[] args) {
        median ob = new median();
        int arr1[] = { 1, 2 };
        int arr2[] = { 1, 2, 3 };
        float result = ob.mediansorted(arr1, arr1.length, arr2.length, arr2);
        System.out.println("Result: " + result);
    }
}
