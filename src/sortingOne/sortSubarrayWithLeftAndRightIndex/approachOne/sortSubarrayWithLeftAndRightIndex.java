package sortingOne.sortSubarrayWithLeftAndRightIndex.approachOne;

public class sortSubarrayWithLeftAndRightIndex {
    int[] sortSubarrayWithLeftAndRightIndex(int arr[],int leftIndex, int rightIndex) {
        int helper[]=devideAndMerge(arr, leftIndex, rightIndex);
        int idx=0;
        for(int i=leftIndex; i<=rightIndex; i++) {
            arr[i]=helper[idx++];
        }
        return arr;
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

    public static void main(String[] args) {
        sortSubarrayWithLeftAndRightIndex sol = new sortSubarrayWithLeftAndRightIndex();
        int res1[]=sol.sortSubarrayWithLeftAndRightIndex(new int[]{59, 11, 8, 91, 49, 44, 8},4,6);
        int res2[]=sol.sortSubarrayWithLeftAndRightIndex(new int[]{50, 40, 30, 20, 10},0,3);

        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res2.length;i++){
            System.out.print(res2[i]+" ");
        }
    }
}
