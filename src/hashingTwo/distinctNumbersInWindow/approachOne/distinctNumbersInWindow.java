package hashingTwo.distinctNumbersInWindow.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class distinctNumbersInWindow {

    ArrayList<Integer> distinctNumbersInWindow(ArrayList<Integer> arr,int k){
        int firstIndex=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }else{
                map.put(arr.get(i),1);
            }
        }
        res.add(map.size());
        for(int i=k;i< arr.size();i++){
            if(map.containsKey(arr.get(firstIndex))){
                if(map.get(arr.get(firstIndex))==1){
                    map.remove(arr.get(firstIndex));
                }else {
                    map.put(arr.get(firstIndex), map.get(arr.get(firstIndex)) - 1);
                }
            }
            firstIndex++;
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }else{
                map.put(arr.get(i),1);
            }
            res.add(map.size());
        }
        return res;
    }
    public static void main(String[] args) {
        distinctNumbersInWindow distinctNumbersInWindow = new distinctNumbersInWindow();
        System.out.println(distinctNumbersInWindow.distinctNumbersInWindow(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)), 3));
        System.out.println(distinctNumbersInWindow.distinctNumbersInWindow(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3)), 3));
        System.out.println(distinctNumbersInWindow.distinctNumbersInWindow(new ArrayList<>(Arrays.asList(1, 1, 2, 2)), 1));
        System.out.println(distinctNumbersInWindow.distinctNumbersInWindow(new ArrayList<>(Arrays.asList(1, 2, 1, 2, 2, 2)), 3));

    }
}
