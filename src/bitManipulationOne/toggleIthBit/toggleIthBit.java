package bitManipulationOne.toggleIthBit;

public class toggleIthBit {
    int getNumAfterToggleIthBit(int num,int bit){
            num=(num ^ (1<<bit));

        return num;
    }
    public static void main(String[] args) {
        System.out.println(new toggleIthBit().getNumAfterToggleIthBit(4,1));
        System.out.println(new toggleIthBit().getNumAfterToggleIthBit(5,2));
    }
}
