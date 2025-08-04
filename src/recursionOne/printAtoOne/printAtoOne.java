package recursionOne.printAtoOne;

public class printAtoOne {
    void printAtoOne(int n) {
        print(n);
        System.out.println();
    }
    void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        printAtoOne o = new printAtoOne();
        o.printAtoOne(5);
    }
}
