package Array_Program;
class median{
    float mediansorted(int arr1[],int size1,int size2,int arr2[]){
        int total=size1+size2;
        if(total%2!=0){
            int sum=0;
            for(int i=0;i<total;i++){
                sum+=i;
            }
            float Average=sum/total;
            return Average;
        }
        else{
            int s=0,e=total-1;
            int mid=s+(e-s)/2;
            float median=(arr1[mid]+arr2[mid+1]);
            return median;
        }
    }
}
public class medianOfTwoSortedArray {
    
}
