package hashingOne.frequencyOfElementQuery.approachTwo;

import java.util.HashMap;

public class frequencyOfElementQuery {
    int[] frequencyOfElementQuery(int arr[],int[] queries){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] frq = new int[queries.length];
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int oldFrequency = map.get(arr[i]);
                map.put(arr[i],oldFrequency+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(map.containsKey(queries[i])){
                frq[i] = map.get(queries[i]);
            }else{
                frq[i] = 0;
            }
        }
        return frq;
    }
    public static void main(String[] args) {
        frequencyOfElementQuery q = new frequencyOfElementQuery();
        int ans1[]=q.frequencyOfElementQuery(new int[]{1, 2, 1, 1},new int[]{1, 2});
        int ans2[]= q.frequencyOfElementQuery(new int[]{2, 5, 9, 2, 8},new int[]{3, 2});
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
