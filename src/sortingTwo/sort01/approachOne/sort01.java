package sortingTwo.sort01.approachOne;

public class sort01 {
    int[] sort01(int arr[]){
        int zeroSortedAreaLastIndex=0;
        int oneSortedAreaLastIndex=0;
        while(oneSortedAreaLastIndex<=arr.length-1){
            if((zeroSortedAreaLastIndex==oneSortedAreaLastIndex && arr[zeroSortedAreaLastIndex]==0 && arr[oneSortedAreaLastIndex]==0)
                    || (arr[zeroSortedAreaLastIndex]==0 && arr[oneSortedAreaLastIndex]==1) ){
                zeroSortedAreaLastIndex++;
                oneSortedAreaLastIndex++;
            }else if(arr[zeroSortedAreaLastIndex]==1 && arr[oneSortedAreaLastIndex]==0){
                int temp=arr[zeroSortedAreaLastIndex];
                arr[zeroSortedAreaLastIndex]=arr[oneSortedAreaLastIndex];
                arr[oneSortedAreaLastIndex]=temp;
                zeroSortedAreaLastIndex++;
                oneSortedAreaLastIndex++;
            }else{
                oneSortedAreaLastIndex++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        sort01 sort01 = new sort01();
        int ans1[]=sort01.sort01(new int[]{0,0,1,0,1,1,0});
        int ans2[]=sort01.sort01(new int[]{1,0});
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i]+" ");
        }

    }
}
