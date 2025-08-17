package sortingTwo.sortByColor.approachOne;

public class sortByColor {
    int[] sortByColor(int arr[]){
        int i=-1,j=0,k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else if(arr[j]==2){
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;
                continue;
            }
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        sortByColor sortByColor = new sortByColor();
        int ans1[] = sortByColor.sortByColor(new int[]{0, 1, 2, 0, 1, 2});
        int ans2[] = sortByColor.sortByColor(new int[]{0});
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
