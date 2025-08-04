package recursionOne.findFactorial;

public class findFactorial {
    int findFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        findFactorial f = new findFactorial();
        System.out.println(f.findFactorial(4));
        System.out.println(f.findFactorial(5));
    }
}
