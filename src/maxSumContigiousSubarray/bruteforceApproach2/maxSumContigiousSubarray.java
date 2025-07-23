package maxSumContigiousSubarray.bruteforceApproach2;

public class maxSumContigiousSubarray {
      int maxSum(int[] arr){
            int sum;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                sum=0;
                for(int j=i;j<arr.length;j++){
                        sum+=arr[j];
                        max=Math.max(max,sum);
                }
            }
            return max;
        }
        public static void main(String[] args) {
            maxSumContigiousSubarray obj = new maxSumContigiousSubarray();
            System.out.println(obj.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4} ));
        }
}
