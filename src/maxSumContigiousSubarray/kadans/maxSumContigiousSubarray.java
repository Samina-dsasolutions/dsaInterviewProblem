package maxSumContigiousSubarray.kadans;

public class maxSumContigiousSubarray {
    int maxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>max){
                max=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxSumContigiousSubarray obj = new maxSumContigiousSubarray();
        System.out.println(obj.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4} ));
    }
}
