package sortingOne.smallestNumber.approachOne;

public class smallestNumber {
    int[] smallestNumber(int arr[]){
        int freq[]=new int[10];
        int res[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            //element start from 0 -9 ,index also start from 0-9 .mapping is easy
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            for(int j=0;j<freq[i];j++){
                res[idx++]=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        smallestNumber s=new smallestNumber();
        int[] ans1=s.smallestNumber(new int[]{6, 3, 4, 2, 7, 2, 1});
        int[] ans2=s.smallestNumber(new int[]{4, 2, 7, 3, 9, 0});

        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }

    }
}
