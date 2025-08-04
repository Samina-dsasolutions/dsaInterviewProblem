package hashingOne.firstRepeatingElement.approachTwo;

import java.util.HashMap;

public class firstRepeatingElement {
    int firstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) > 1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstRepeatingElement f = new firstRepeatingElement();
        System.out.println(f.firstRepeatingElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(f.firstRepeatingElement(new int[]{10, 5, 3, 4, 3, 5, 6}));
    }
}
