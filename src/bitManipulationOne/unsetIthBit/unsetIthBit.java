package bitManipulationOne.unsetIthBit;

public class unsetIthBit {
    int getNumberAfterUnsetIthBit(int num,int i){
        if((num&(1<<i))==0){
            return num;
        }
        //if ith bit is already set then toggle the other bit as well
        return (num^(1<<i));
    }
    public static void main(String[] args) {
        unsetIthBit unsetIthBit=new unsetIthBit();
        System.out.println(unsetIthBit.getNumberAfterUnsetIthBit(5,2));
        System.out.println(unsetIthBit.getNumberAfterUnsetIthBit(4,1));
    }
}
