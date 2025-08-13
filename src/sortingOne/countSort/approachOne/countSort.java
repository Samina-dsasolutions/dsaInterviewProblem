package sortingOne.countSort.approachOne;

public class countSort {
    int[] countSort(int arr[]){
        int max=arr[0];
        int idx=0;
        int[] res=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] freq = new int[max];
        for(int i=0;i<arr.length;i++){
            //get the index - element -1
            freq[arr[i]-1]++;
        }

        for(int i=0;i<freq.length;i++){
            //get the element : index+1
            for(int j=0;j<freq[i];j++){
                res[idx++]=i+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        countSort countSort = new countSort();
        int res1[]=countSort.countSort(new int[]{1, 3, 1});
        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
        System.out.println();
        int res2[]=countSort.countSort(new int[]{4, 2, 1, 3});
        for(int i=0;i<res2.length;i++){
            System.out.print(res2[i]+" ");
        }
        System.out.println();
    }
}
