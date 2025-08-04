package hashingOne.frequencyOfElementQuery.approachOne;

public class frequencyOfElementQuery {
    int[] frequencyOfElementQuery(int arr[],int[]queries){
        int fre[]=new int[queries.length];
        int num;
        int count;
        for(int i=0;i<queries.length;i++){
            num=queries[i];
            count=0;
            for(int j=0;j<arr.length;j++){
                if(num==arr[j]){
                    count++;
                }
            }
            fre[i]=count;
        }
        return fre;
    }
    public static void main(String[] args) {
        frequencyOfElementQuery q=new frequencyOfElementQuery();
        int ans1[]=q.frequencyOfElementQuery(new int[]{1, 2, 1, 1},new int[]{1, 2});
        int ans2[]= q.frequencyOfElementQuery(new int[]{2, 5, 9, 2, 8},new int[]{3, 2});
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
