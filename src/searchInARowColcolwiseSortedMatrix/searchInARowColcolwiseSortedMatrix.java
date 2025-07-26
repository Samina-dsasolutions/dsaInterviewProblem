package searchInARowColcolwiseSortedMatrix;

public class searchInARowColcolwiseSortedMatrix {
    int getsearchInARowColcolwiseSortedMatrix(int arr[][],int target){
        int row=0;
        int col=arr[0].length-1;
        int ans=0;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                //i * 1009 + j
                //use 1 based indexing for returning value
                while(col>=0 && arr[row][col]==target){
                    ans=(row+1)*1009+(col+1);
                    col--;
                }
                return ans;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else if(arr[row][col]<target){
                row++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        searchInARowColcolwiseSortedMatrix obj = new searchInARowColcolwiseSortedMatrix();

        System.out.println(obj.getsearchInARowColcolwiseSortedMatrix(arr,2));
    }
}
