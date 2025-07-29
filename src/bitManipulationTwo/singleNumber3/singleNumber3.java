package bitManipulationTwo.singleNumber3;

public class singleNumber3 {
    int[] getsingleNumber3(int arr[]){
        int xorAll=arr[0];
        int firstSetBit=0;
        int num1=0;
        int num2=0;
        //XOR of all number : store in xorAll
        for(int i=1;i<arr.length;i++){
            xorAll^=arr[i];
        }
        //find first set bit from xorAll number (check start from 0th bit)
        for(int i=0;i<32;i++){
            if((xorAll & (1<<i))!=0){
                firstSetBit=i;
                break;
            }
        }
        //based on firstSetBit segregate  all number into two group
        for(int i=0;i<arr.length;i++){
            if((arr[i] &(1<<firstSetBit))!=0){
                num1=num1^arr[i];
            }else{
                num2=num2^arr[i];
            }
        }
       return num1>num2?new int[]{num2,num1}:new int[]{num1,num2};
    }
    public static void main(String[] args) {
        singleNumber3 solution = new singleNumber3();
        int arr1[]=new int[]{1, 2, 3, 1, 2, 4};
        int arr2[]=new int[]{1, 2};
        int arr3[]=new int[]{2, 3, 2, 5, 6, 3, 7, 6};
        int res1[]=solution.getsingleNumber3(arr1);
        int res2[]=solution.getsingleNumber3(arr2);
        int res3[]= solution.getsingleNumber3(arr3);
        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res2.length;i++){
            System.out.print(res2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res3.length;i++){
            System.out.print(res3[i]+" ");
        }
        System.out.println();
    }
}
