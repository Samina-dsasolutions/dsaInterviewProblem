package hashingTwo.subarrayWithGivenSum.approachOne;

import java.util.*;

public class subarrayWithGivenSum {
    ArrayList<Integer> subarrayWithGivenSum(ArrayList<Integer> arr,int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Long,Integer> map = new HashMap<>();
        int endIndex=-1;
        int startIndex=-1;
        long psum=0L;
        map.put(0L,-1);
        for(int i=0;i<arr.size();i++){
            psum+=arr.get(i);
            if(map.containsKey(psum-k)){
                System.out.println("next window found "+(psum-k)+" "+map.get(psum-k));
                startIndex=map.get(psum-k)+1;
                endIndex=i;
                break;
            }else{
                System.out.println("adding window  "+psum+" "+i);
                map.put(psum,i);
            }
        }
        System.out.println(startIndex +" "+endIndex);
        if(endIndex!=-1){
            for(int i=startIndex;i<=endIndex;i++){
                list.add(arr.get(i));
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        subarrayWithGivenSum obj = new subarrayWithGivenSum();
        System.out.println(obj.subarrayWithGivenSum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)),5));
        System.out.println(obj.subarrayWithGivenSum(new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105)),110));


    }
}
