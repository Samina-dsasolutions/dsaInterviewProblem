package hashingOne.countUniqueElements.approachTwo;

import java.util.HashMap;

public class countUniqueElements {
    int countUniqueElements(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i])==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        countUniqueElements obj = new countUniqueElements();
        System.out.println(obj.countUniqueElements(new int[]{3, 4, 3, 6, 6}));
        System.out.println(obj.countUniqueElements(new int[]{3, 3, 3, 9, 0, 1, 0}));
    }
}
