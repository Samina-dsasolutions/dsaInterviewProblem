package bitManipulationOne.checkBit;

public class checkBit {
    int checkBit(int num,int i){
        if((num & (1<<i))==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        checkBit test = new checkBit();
        System.out.println(test.checkBit(4,1));
        System.out.println(test.checkBit(5,2));
    }
}
