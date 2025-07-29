package bitManipulationTwo.sumOfXorOfAllPairs;

public class sumOfXorOfAllPairs {
    int getsumOfXorOfAllPairs(int A[]){
        final int mod = (int)(1e9 + 7);
        int n = A.length;
        long ans = 0;
        for(int j = 0; j < 32; j++){
            long zero = 0, one = 0, temp;

            //  Count of zeros and ones for each bit
            for(int i = 0; i < n; i++){
                if (A[i] % 2 == 0)
                    zero++;
                else
                    one++;
                A[i] /= 2;
            }

            // calculating individual bit sum
            temp = zero * one * (1 << j);
            ans = (ans + temp) % mod;
        }
        return (int)(ans);
    }
    public static void main(String[] args) {
        sumOfXorOfAllPairs obj = new sumOfXorOfAllPairs();
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{1, 2, 3}));
        System.out.println(obj.getsumOfXorOfAllPairs(new int[]{3, 4, 2}));

    }
}
