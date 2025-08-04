package recursionOne.findFactorial2.approachTwo;

public class findFactorial2 {
    int findFibonacci(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
       for(int i=2;i<=n;i++){
           arr[i]=arr[i-2]+arr[i-1];
       }
        return arr[n];
    }
    public static void main(String[] args) {
        findFactorial2 obj=new findFactorial2();
        System.out.println(obj.findFibonacci(5));
        System.out.println(obj.findFibonacci(10));
    }
}
