package hashingTwo.longestSubarrayZeroSum.approachOne;

import java.util.HashMap;

public class longestSubarrayZeroSum {
    int longestSubarrayZeroSum(int arr[]){
        int longestSubarrayZeroSumlength=0;
        long psum=0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(psum, -1);
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(map.containsKey(psum)){
                //get length of of window
                //current window length-previouis window length
                    longestSubarrayZeroSumlength=Math.max(longestSubarrayZeroSumlength, i-map.get(psum));

            }else{
                map.put(psum, i);
            }
        }
        return longestSubarrayZeroSumlength;
    }
    public static void main(String args[]){
        longestSubarrayZeroSum obj = new longestSubarrayZeroSum();
        System.out.println(obj.longestSubarrayZeroSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(obj.longestSubarrayZeroSum(new int[]{1, -2, 1, 2}));
    }
}
