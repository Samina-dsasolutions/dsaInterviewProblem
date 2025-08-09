package hashingOne.countSubarrayZeroSum.approachOne;

import java.util.HashMap;

public class countSubarrayZeroSum {
    int countSubarrayZeroSum(int arr[]){
        HashMap<Long, Long> map = new HashMap<>();
        long psum=0;
        long frq=1;
        long count = 0;
        map.put(psum, frq);
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(map.containsKey(psum)){
                count+=map.get(psum);
            }
            if(map.containsKey(psum)){
                map.put(psum, map.get(psum)+1);
            }else{
                map.put(psum,1L);
            }
        }
        return (int)count;
    }
    public static void main(String[] args) {
        countSubarrayZeroSum obj = new countSubarrayZeroSum();
        System.out.println(obj.countSubarrayZeroSum(new int[]{1, -1, -2, 2}));
        System.out.println(obj.countSubarrayZeroSum(new int[]{-1, 2, -1}));
        System.out.println(obj.countSubarrayZeroSum(new int[]{2,2,1,-3,4,-4,1,-1,3,-3}));
    }
}
