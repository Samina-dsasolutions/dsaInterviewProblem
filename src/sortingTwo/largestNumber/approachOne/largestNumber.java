package sortingTwo.largestNumber.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class largestNumber {
    String largestNumber(ArrayList<Integer> arr) {
        boolean allZero=true;
        for(Integer num: arr){
            if(num!=0){
                allZero=false;
                break;
            }
        }
        if(allZero){
            return "0";
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = (o1.toString()+o2.toString());
                String str2 = (o2.toString()+o1.toString());
                if(str1==str2){
                    return 0;
                }
                return  str2.compareTo(str1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        largestNumber l = new largestNumber();
        System.out.println(l.largestNumber(new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9))));

    }
}
