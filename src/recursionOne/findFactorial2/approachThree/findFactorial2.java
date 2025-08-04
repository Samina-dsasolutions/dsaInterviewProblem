package recursionOne.findFactorial2.approachThree;

public class findFactorial2 {
     int findFibonacci(int n) {
        if(n == 0)return 0;
        if(n == 1)return 1;
        int a=0;
        int b=1;
        int res=0;
        while(n>1){
            res=a+b;
            a=b;
            b=res;
            n--;
        }
        return res;
    }
    public static void main(String[] args) {
        findFactorial2 f = new findFactorial2();
        System.out.println(f.findFibonacci(5));
        System.out.println(f.findFibonacci(10));
    }
}
