package recursionOne.sumOfDigits;

public class sumOfDigits {
    int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        sumOfDigits sumOfDigits = new sumOfDigits();
        System.out.println(sumOfDigits.sumOfDigits(10));
        System.out.println(sumOfDigits.sumOfDigits(365));
    }
}
