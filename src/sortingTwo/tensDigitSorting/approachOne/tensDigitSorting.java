package sortingTwo.tensDigitSorting.approachOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class tensDigitSorting {

    ArrayList<Integer> tensDigitSorting(ArrayList<Integer> arr){
        Collections.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                Integer n1= (o1/10)%10;
                Integer n2= (o2/10)%10;
                if(n1==n2){
                    return o2-o1;
                }
                return n1-n2;
            }

        });
        return arr;
    }
    public static void main(String[] args) {
        tensDigitSorting sorting = new tensDigitSorting();
        System.out.println(sorting.tensDigitSorting(new ArrayList<>(Arrays.asList(15, 11, 7, 19))));
        System.out.println(sorting.tensDigitSorting(new ArrayList<>(Arrays.asList(2, 24, 22, 19))));
    }
}
