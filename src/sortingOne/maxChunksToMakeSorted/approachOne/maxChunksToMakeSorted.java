package sortingOne.maxChunksToMakeSorted.approachOne;

public class maxChunksToMakeSorted {
    int maxChunksToMakeSorted(int arr[]){
        int max=-1;
        int chunkCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(max==i){
                chunkCount++;
            }
        }
        return chunkCount;
    }
    public static void main(String[] args) {
        maxChunksToMakeSorted maxChunksToMakeSorted = new maxChunksToMakeSorted();
        System.out.println(maxChunksToMakeSorted.maxChunksToMakeSorted(new int[]{0,1,2,3,4,5}));
        System.out.println(maxChunksToMakeSorted.maxChunksToMakeSorted(new int[]{1, 2, 3, 4, 0}));
        System.out.println(maxChunksToMakeSorted.maxChunksToMakeSorted(new int[]{2, 0, 1, 3}));
    }
}
