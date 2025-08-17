package sortingTwo.waveArray.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class waveArray {

    ArrayList<Integer> waveArray(ArrayList<Integer> arr) {
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }) ;
        for (int i = 0; i < arr.size()-1; i+=2) {
            int temp=arr.get(i);
            arr.set(i, arr.get(i+1));
            arr.set(i+1, temp);
        }
        return arr;
    }
    public static void main(String[] args) {
        waveArray waveArray = new waveArray();
        System.out.println(waveArray.waveArray(new ArrayList<>(Arrays.asList(1,2,3,4))));
        System.out.println(waveArray.waveArray(new ArrayList<>(Arrays.asList(1,2))));
    }
}
