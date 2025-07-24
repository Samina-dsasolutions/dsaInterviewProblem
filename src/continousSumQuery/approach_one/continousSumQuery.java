package continousSumQuery.approach_one;

public class continousSumQuery {
    int[] getcontinousSumQuery(int people,int[][] query){
            int[] arr=new int[people];
            int startNumber;
            int endNumber;
            int amount;
            for(int i=0;i<query.length;i++){
                    startNumber=query[i][0];
                    endNumber=query[i][1];
                    amount=query[i][2];
                    for(int j=startNumber-1;j<endNumber;j++){
                        arr[j]+=amount;
                    }

            }
            return arr;

    }
    public static void main(String[] args) {
        continousSumQuery sq=new continousSumQuery();
       int arr[]= sq.getcontinousSumQuery(5,new int[][]{{1,2,10},{2,3,20},{2,5,25}});
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }

    }
}
