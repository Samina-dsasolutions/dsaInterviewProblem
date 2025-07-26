package continousSumQuery.approach_two;

public class continousSumQuery {
    int[] getcontinousSumQuery(int people,int query[][]){
        int[] arr=new int[people];
        int startNumber;
        int endNumber;
        int amount;
        for(int i=0;i<query.length;i++){
            startNumber=query[i][0];
            endNumber=query[i][1];
            amount=query[i][2];
            startNumber--;
            endNumber--;
            arr[startNumber]+=amount;
            if(endNumber<arr.length-1){
                arr[endNumber+1]-=amount;
            }
        }
        int[] prefixSum=getPrefisumarr(arr);
        return prefixSum;
    }

   int[] getPrefisumarr(int arr[]){
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
   }

    public static void main(String[] args) {
        int A=5;
        int query[][]={
                {1,2,10},
                {2,3,20},
                {2,5,25}
        };
        continousSumQuery q=new continousSumQuery();
        int ans[]=new int[A];
        ans=q.getcontinousSumQuery(A,query);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
