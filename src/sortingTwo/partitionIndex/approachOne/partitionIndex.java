package sortingTwo.partitionIndex.approachOne;

public class partitionIndex {
    int partitionIndex(int arr[]){
        int pivot=arr[arr.length-1];
        int i=0,j=0;
        while(j<arr.length-1){
            if(i==j && arr[i]<pivot){
                i++;j++;
            }else if(arr[j]>pivot){
                j++;
            }else if(arr[i]>pivot && arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }

        //   System.out.println("first element index greater than pivot :" + i);
        //    System.out.println("last element index greater than pivot :" + j);
        if(i==j){
            return 0;
        }else{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return i;
    }
    public static void main(String[] args) {
        partitionIndex obj=new partitionIndex();
        System.out.println(obj.partitionIndex(new int[]{12,25,6,37,11,44,31,4,38}));
        System.out.println(obj.partitionIndex(new int[]{1,2,3,4,5,6,7,8}));
        System.out.println(obj.partitionIndex(new int[]{9,10,11,12,13,14,15,8}));
    }
}
