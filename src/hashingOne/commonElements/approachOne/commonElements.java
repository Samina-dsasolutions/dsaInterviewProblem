package hashingOne.commonElements.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class commonElements {
    ArrayList<Integer> commonElements(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.size();i++){
            if(map.containsKey(arr1.get(i))){
                map.put(arr1.get(i),map.get(arr1.get(i))+1);
            }else{
                map.put(arr1.get(i),1);
            }
        }
        for(int i=0;i<arr2.size();i++){
            if(map.containsKey(arr2.get(i)) && map.get(arr2.get(i))>0){
                answer.add(arr2.get(i));
                map.put(arr2.get(i),map.get(arr2.get(i))-1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        commonElements obj = new commonElements();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        ArrayList<Integer> ans= obj.commonElements(arr1,arr2);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
