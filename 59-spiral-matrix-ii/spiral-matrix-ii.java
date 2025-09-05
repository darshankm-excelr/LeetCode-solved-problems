class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;

        int rowbegin = 0;
        int colbegin = 0;
        int rowend = n - 1;
        int colend = n - 1;

        while (colbegin <= colend && rowbegin <= rowend) {
            
            for (int j = colbegin; j <= colend; j++) {
                matrix[rowbegin][j] = value++;
            }
            rowbegin++;

            
            for (int i = rowbegin; i <= rowend; i++) {
                matrix[i][colend] = value++;
            }
            colend--;

            
            if (rowbegin <= rowend) {
                for (int j = colend; j >= colbegin; j--) {
                    matrix[rowend][j] = value++;
                }
                rowend--;
            }

         
            if (colbegin <= colend) {
                for (int i = rowend; i >= rowbegin; i--) {
                    matrix[i][colbegin] = value++;
                }
                colbegin++;
            }
        }

        return matrix;
    }
}
