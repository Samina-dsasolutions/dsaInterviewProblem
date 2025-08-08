package hashingTwo.countPairDifference.approachTwo;

import java.util.HashMap;

public class countPairDifference {
    int countPairDifference(int arr[],int k){
        long ans=0;
        long mod=1000000007;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-k)){
                ans+=map.get(arr[i]-k);
            }
        }
        return (int)(ans%mod);
    }
    public static void main(String[] args) {
        countPairDifference obj = new countPairDifference();
        System.out.println(obj.countPairDifference(new int[]{3, 5, 1, 2},4));
        System.out.println(obj.countPairDifference(new int[]{1, 2, 1, 2},1));
    }
}
