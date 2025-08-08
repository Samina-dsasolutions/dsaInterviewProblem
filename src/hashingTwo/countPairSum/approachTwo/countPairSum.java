package hashingTwo.countPairSum.approachTwo;

import java.util.HashMap;

public class countPairSum {
    int countPairSum(int arr[],int k){
        long mod=1000000007;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);

            }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        return (int)(count%mod);
    }
    public static void main(String[] args) {
        countPairSum countPairSum=new countPairSum();
        System.out.println(countPairSum.countPairSum(new int[]{3, 5, 1, 2},8));
        System.out.println(countPairSum.countPairSum(new int[]{1, 2, 1, 2},3));
    }
}
