package bitManipulationTwo.sumOfXorOfAllPairs.approach_two;
public class sumOfXorOfAllPairs {
    int getsumOfXorOfAllPairs(int arr[]){
        long mod=1000000007;
        long sum=0;
        long setbit;
        long unsetbit=0;
        long totalPair=0;
        long contribution=0;
        for(int i=0;i<31;i++){
            setbit=0;
            for(int j=0;j<arr.length;j++){
                //count set bit for each bit
                if((arr[j]&(1<<i))!=0)
                {
                    setbit++;
                }
            }
            //got the set bit;
            //calculate set unset bit
            //total pair will be setbit count * unset bit count;
            unsetbit= arr.length-setbit;
            totalPair= (setbit * unsetbit)%mod;
            // 2^0 where i=0 : 2^0= (1<<i)
            contribution=(totalPair*(1<<i))%mod;
            sum=(sum+contribution)%mod;

        }
        return (int)sum;
    }
    public static void main(String[] args) {
        sumOfXorOfAllPairs obj=new sumOfXorOfAllPairs();
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{1, 2, 3}));
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{3, 4, 2}));
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{1,2,3,1,2,4}));
    }
}
