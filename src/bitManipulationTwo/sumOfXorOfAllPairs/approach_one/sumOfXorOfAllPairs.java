package bitManipulationTwo.sumOfXorOfAllPairs.approach_one;

public class sumOfXorOfAllPairs {
    int getsumOfXorOfAllPairs(int arr[]){
        long sum=0;
        long mod=1000000007;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum+=(arr[i]^arr[j])%mod;
            }
        }

        return (int)sum;
    }
    public static void main(String[] args) {
        sumOfXorOfAllPairs obj = new sumOfXorOfAllPairs();
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{1, 2, 3}));
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{3, 4, 2}));

    }
}
