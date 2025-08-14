package sortingOne.mergeSort.approachOne;

public class mergeSort {
    int[] mergeSort(int[] arr){
       return devideAndMerge(arr, 0, arr.length - 1);
    }
    int[] devideAndMerge(int[] arr,int start,int end){
        int mid=(start+end)/2;
        if(start==end){
            return new int[]{arr[start]};
        }
        int arr1[]=devideAndMerge(arr,start,mid);
        int arr2[]=devideAndMerge(arr,mid+1,end);
        return mergeTwoSortedArrays(arr1,arr2);
    }
    int[] mergeTwoSortedArrays(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int res[]=new int[n+m];
        int i=0,j=0,idx=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                res[idx++]=arr1[i++];
            }else{
                res[idx++]=arr2[j++];
            }
        }
        while(i<n){
            res[idx++]=arr1[i++];
        }
        while(j<m){
            res[idx++]=arr2[j++];
        }
        return res;
    }
    public static void main(String args[]){
        mergeSort m=new mergeSort();
        int[] ans1=m.mergeSort(new int[]{1, 4, 10, 2, 1, 5});
        int[] ans2=m.mergeSort(new int[]{3, 7, 1});
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }

    }
}
