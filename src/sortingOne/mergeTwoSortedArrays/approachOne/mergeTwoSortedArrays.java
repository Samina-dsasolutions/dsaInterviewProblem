package sortingOne.mergeTwoSortedArrays.approachOne;

public class mergeTwoSortedArrays {

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
        mergeTwoSortedArrays obj=new mergeTwoSortedArrays();
        int res1[]=obj.mergeTwoSortedArrays(new int[]{4, 7, 9},new int[]{2, 11, 19});
        int res2[]= obj.mergeTwoSortedArrays(new int[]{1},new int[]{2});
        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res2.length;i++){
            System.out.print(res2[i]+" ");
        }
    }
}
