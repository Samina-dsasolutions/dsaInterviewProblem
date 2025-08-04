package recursionOne.findFactorial2.approachOne;

public class findFactorial2 {
    int findFibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
    public static void main(String[] args) {
        findFactorial2 f = new findFactorial2();
        System.out.println(f.findFibonacci(3));
        System.out.println(f.findFibonacci(5));
    }
}
