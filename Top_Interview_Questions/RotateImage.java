class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < (matrix.length) / 2; i++) {

            for (int j = i; j < matrix[i].length - 1 - (i); j++) {

                int temp1 = matrix[i][j];
                int temp2 = matrix[j][(matrix.length - 1) - i];
                int temp3 = matrix[(matrix.length - 1) - i][(matrix.length - 1) - j];
                int temp4 = matrix[(matrix.length - 1) - j][i];

                matrix[i][j] = temp4;
                matrix[j][(matrix.length - 1) - i] = temp1;
                matrix[(matrix.length - 1) - i][(matrix.length - 1) - j] = temp2;
                matrix[(matrix.length - 1) - j][i] = temp3;
            }
        }
    }
}