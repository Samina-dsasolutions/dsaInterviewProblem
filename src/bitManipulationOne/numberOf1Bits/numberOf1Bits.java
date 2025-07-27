package bitManipulationOne.numberOf1Bits;

public class numberOf1Bits {
    int getNumberOf1Bits(int num){
        int count=0;
        for(int i=0;i<32;i++){
            if((num&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        numberOf1Bits n = new numberOf1Bits();
        System.out.println(n.getNumberOf1Bits(11));
    }
}
