package hashingTwo.checkPairSum.approachTwo;

import java.util.HashSet;

public class checkPairSum {
    int checkPairSum(int k, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(k-arr[i])) {
                return 1;
            }else{
                set.add(arr[i]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        checkPairSum checkPairSum = new checkPairSum();
        System.out.println(checkPairSum.checkPairSum(8, new int[]{3, 5, 1, 2, 1, 2}));
        System.out.println(checkPairSum.checkPairSum(21, new int[]{9, 10, 7, 10, 9, 1, 5, 1, 5}));
    }
}
