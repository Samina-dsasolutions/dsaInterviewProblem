package bitManipulationOne.singleNumber;

public class singleNumber {
    int getSingleNumber(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=(ans^arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={1, 2, 2, 3, 1};
        int arr2[]={1, 2, 2};
        singleNumber obj=new singleNumber();
        System.out.println(obj.getSingleNumber(arr1));
        System.out.println(obj.getSingleNumber(arr2));

    }
}
