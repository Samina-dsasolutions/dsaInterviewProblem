package sortingTwo.partitionIndex.approachTwo;

public class partitionIndex {
    int partitionIndex(int arr[]){
        int i=-1;
        int j=0;
        int pivot=arr[arr.length-1];
        while(j<arr.length-1){
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
        partitionIndex obj=new partitionIndex();
        System.out.println(obj.partitionIndex(new int[]{6, 2, 0, 4, 5}));
        System.out.println(obj.partitionIndex(new int[]{1, 2, 3, 4, 5}));
    }
}
