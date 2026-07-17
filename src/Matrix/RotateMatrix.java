package Matrix;

import java.util.Arrays;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] result = new int[n][n];

        // transpose the matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp     = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the matrix
        for(int i=0; i<n; i++){
            int left  = 0;
            int right = n-1;

            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
