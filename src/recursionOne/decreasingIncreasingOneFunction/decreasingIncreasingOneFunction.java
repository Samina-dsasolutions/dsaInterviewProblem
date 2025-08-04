package recursionOne.decreasingIncreasingOneFunction;

public class decreasingIncreasingOneFunction {
    void decreasingIncreasingOneFunction(int A){
        numberPrint(A);
        System.out.println();
    }
    void numberPrint(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        numberPrint(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        decreasingIncreasingOneFunction obj = new decreasingIncreasingOneFunction();
        obj.decreasingIncreasingOneFunction(3);
        obj.decreasingIncreasingOneFunction(5);
    }
}
