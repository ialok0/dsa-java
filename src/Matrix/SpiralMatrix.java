package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //function to return matrix in spiral order
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top    = 0;                 // starting row
        int bottom = matrix.length-1;   // ending row
        int left   = 0;                 // starting column
        int right  = matrix[0].length-1;// ending column

        // loop until all elements are traversed
        while(top <= bottom && left <= right){

            // traverse the row from left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // traverse the column from top to bottom
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            // traverse the row from right to left(if row remains)
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // traverse the column bottom to top (if column remains)
            if(left <= right){
                for(int i=bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left ++;
            }
        }
        return result;
    }
}
