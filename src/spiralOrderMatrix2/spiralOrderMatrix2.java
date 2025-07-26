package spiralOrderMatrix2;

public class spiralOrderMatrix2 {
    int[][] getspiralOrderMatrix2(int A) {
        int ans[][] = new int[A][A];
        int printcount = A - 1;
        int row = 0;
        int col = 0;
        int num = 1;
        while (printcount > 1) {


            for (int count = 0; count < printcount; count++) {
                ans[row][col] = num;
                col++;
                num++;
            }
            for (int count = 0; count < printcount; count++) {
                ans[row][col] = num;
                row++;
                num++;
            }
            for (int count = 0; count < printcount; count++) {
                ans[row][col] = num;
                col--;
                num++;
            }
            for (int count = 0; count < printcount; count++) {
                ans[row][col] = num;
                row--;
                num++;
            }
            row++;
            col++;
            printcount -= 2;
        }
        if (printcount == 0) {
            ans[row][col] = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        spiralOrderMatrix2 sol = new spiralOrderMatrix2();
        int arr[][]=sol.getspiralOrderMatrix2(5);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
