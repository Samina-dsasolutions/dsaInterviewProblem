package sortingTwo.factorsSort.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class factorsSort {

    ArrayList<Integer> factorsSort(ArrayList<Integer> arr){

            Collections.sort(arr,new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    Integer fact1 = getFactorCount(o1);
                    Integer fact2 = getFactorCount(o2);
                    if(fact1 == fact2){
                        return o1-o2;
                    }
                    return fact1-fact2;
                }
            });
        return arr;
    }
    Integer getFactorCount(int n){
        Integer factorCount = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                factorCount+=2;
            }
        }
        return factorCount;
    }

    public static void main(String[] args) {
        factorsSort fs = new factorsSort();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(6,8,9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,4,7));
        System.out.println(fs.factorsSort(arr1));
        System.out.println(fs.factorsSort(arr2));

    }
}
