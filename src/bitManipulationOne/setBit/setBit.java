package bitManipulationOne.setBit;

public class setBit {
    int setBit(int i,int j){
        int ans=0;
        ans= (ans | (1<<i));
        ans= (ans | (1<<j));
        return ans;
    }
    public static void main(String[] args) {
        setBit setBit=new setBit();
        System.out.println(setBit.setBit(3,5));
        System.out.println(setBit.setBit(4,4));
    }
}
