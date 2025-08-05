package hashingOne.countUniqueElements.approachOne;

import java.util.ArrayList;

public class countUniqueElements {
    int countUniqueElements(int arr[]){
        boolean isUnique = false;
        int count=0;
        for(int i=0;i<arr.length;i++){
            isUnique=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isUnique=false;
                    break;
                }
            }
            for(int k=i-1;k>=0;k--){
                if(arr[i]==arr[k]){
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
        countUniqueElements obj = new countUniqueElements();
        System.out.println(obj.countUniqueElements(new int[]{3, 4, 3, 6, 6}));
        System.out.println(obj.countUniqueElements(new int[]{3, 3, 3, 9, 0, 1, 0}));
    }
}
