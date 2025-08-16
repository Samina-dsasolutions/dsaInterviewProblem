package sortingTwo.quickSort.approachOne;

public class quickSort {
    int[] quickSort(int arr[]){
        sortAllelementbasedOnePartitionIndex(arr,0,arr.length-1);
        return arr;
    }
    void sortAllelementbasedOnePartitionIndex(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pi= getPartitionIndex(arr,low,high);
        sortAllelementbasedOnePartitionIndex(arr,low,pi-1);
        sortAllelementbasedOnePartitionIndex(arr,pi+1,high);
    }
    int getPartitionIndex(int arr[],int low,int high){
        int pivot=arr[high];
        int i= low-1;
        int j=low;
        while(j<high){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return i;
    }
    public static void main(String[] args) {
        quickSort quickSort=new quickSort();
        int ans1[]=quickSort.quickSort(new int[]{1, 4, 10, 2, 1, 5});
        int ans2[]=quickSort.quickSort(new int[]{3, 7, 1});

        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
