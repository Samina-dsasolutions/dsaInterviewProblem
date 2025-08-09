package hashingOne.subArrayWith0Sum.approachOne;

import java.util.HashSet;

public class subArrayWith0Sum {
    int subArrayWith0Sum(int arr[]){
        long psum=0;
        HashSet<Long> set = new HashSet<>();
        set.add(psum);
        for (int i = 0; i < arr.length; i++) {
            psum+=arr[i];
            if(set.contains(psum)){
                return 1;
            }
            set.add(psum);
        }
        return 0;
    }
    public static void main(String[] args) {
        subArrayWith0Sum obj = new subArrayWith0Sum();
        System.out.println(obj.subArrayWith0Sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(obj.subArrayWith0Sum(new int[]{4, -1, 1}));
    }
}
