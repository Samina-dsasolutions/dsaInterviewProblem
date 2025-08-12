package hashingTwo.subarraySumEqualsK.approachOne;

import java.util.HashMap;

public class subarraySumEqualsK {
    int subarraySumEqualsK(int arr[],int k){
        int count=0;
        long psum=0;
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0l,1);
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(map.containsKey(psum-k)){
                count+=map.get(psum-k);
            }
            if(map.containsKey(psum)){
                map.put(psum,map.get(psum)+1);
            }else{
                map.put(psum,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        subarraySumEqualsK obj = new subarraySumEqualsK();
        System.out.println(obj.subarraySumEqualsK(new int[]{1, 0, 1}, 1));
        System.out.println(obj.subarraySumEqualsK(new int[]{0, 0, 0}, 0));
    }
}
