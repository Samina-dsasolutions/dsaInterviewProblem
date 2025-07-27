package bitManipulationTwo.singleNumber2;

public class singleNumber2 {
    int getSingleNumber2(int arr[]){
        int ans=0;
        int count;
        //check for all bit
        for(int i=0;i<32;i++){
            //for each bit check all number's ith bit is set or not
            //count the total bit then check if it odd or even
            //if even then all bit paird -> make ans ith bit 0
            //if odd then one number that are not paired -> make ans ith bit 1
            count=0;
            for(int j=0;j< arr.length;j++){
             if((arr[j]&(1<<i))!=0) {
                 count++;
             }
            }
            if(count%3!=0){//count is odd
                //set ans ith bit 1
                ans= (ans |(1<<i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        singleNumber2 obj = new singleNumber2();
        System.out.println(obj.getSingleNumber2(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
        System.out.println(obj.getSingleNumber2(new int[]{0, 0, 0, 1}));
    }
}
