package hashingOne.countDistinctElements.approachOne;

public class countDistinctElements {
    int countDistinctElements(int arr[]){

        int count=0;
        boolean isUnique=false;
        for(int i=0;i<arr.length;i++){
            isUnique=true;
            //lets say initially all are unique
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        countDistinctElements obj = new countDistinctElements();
        System.out.println(obj.countDistinctElements(new int[]{3, 3, 3, 9, 0, 1, 0}));
    }
}
