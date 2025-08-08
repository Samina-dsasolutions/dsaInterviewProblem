package hashingTwo.countPairDifference.approachOne;

public class countPairDifference {
    int countPairDifference(int arr[],int k){
        long ans=0;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]-arr[j]==k){
                    ans++;
                }
            }
        }
        return (int)(ans%mod);
    }
    public static void main(String[] args) {
        countPairDifference obj = new countPairDifference();
        System.out.println(obj.countPairDifference(new int[]{3, 5, 1, 2}, 4));
        System.out.println(obj.countPairDifference(new int[]{1, 2, 1, 2}, 1));
    }
}
