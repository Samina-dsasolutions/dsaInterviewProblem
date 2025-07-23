package maxSumContigiousSubarray.bruteforceApproach3;

public class maxSumContigiousSubarray {
    int maxSum(int[] arr){
        int prefixSum[]=getPrefixSum(arr);
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(j==0){
                    sum=prefixSum[j];
                }else{
                    sum=prefixSum[j-1]-prefixSum[i];
                }
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
      maxSumContigiousSubarray obj = new maxSumContigiousSubarray();
       System.out.println(obj.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4} ));
    }
}
