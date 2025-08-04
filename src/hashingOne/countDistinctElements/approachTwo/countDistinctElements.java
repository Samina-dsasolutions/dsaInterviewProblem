package hashingOne.countDistinctElements.approachTwo;

import java.util.HashSet;

public class countDistinctElements {

    int countDistinctElements(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        countDistinctElements obj = new countDistinctElements();
        System.out.println(obj.countDistinctElements(new int[]{3, 3, 3, 9, 0, 1, 0}));
    }
    
}
