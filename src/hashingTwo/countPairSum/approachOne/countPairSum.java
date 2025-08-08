package hashingTwo.countPairSum.approachOne;

public class countPairSum {
    int countPairSum(int k,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        countPairSum obj = new countPairSum();
        System.out.println(obj.countPairSum(8,new int[]{3, 5, 1, 2}));
        System.out.println(obj.countPairSum(3,new int[]{1, 2, 1, 2}));

    }
}
