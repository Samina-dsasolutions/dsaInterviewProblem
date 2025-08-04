package recursionOne.printOneTwoA;

public class printOneTwoA {
    void printOneTwoA(int A){
        print(A);
        System.out.println();
    }
    void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printOneTwoA printOneTwoA = new printOneTwoA();
        printOneTwoA.printOneTwoA(5);
    }
}
