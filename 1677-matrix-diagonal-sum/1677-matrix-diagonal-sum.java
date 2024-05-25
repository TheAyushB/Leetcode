class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int sum = 0;
        for(int rowNo = 0; rowNo < row; rowNo++){
            int primaryDiagonal = mat[rowNo][rowNo];
            int secondaryDiagonal = mat[rowNo][col - rowNo - 1];
            sum += primaryDiagonal;
            // based on some conditiopn
            if(rowNo != (col - rowNo - 1))
                sum += secondaryDiagonal;
        }
        return sum;
    }
}