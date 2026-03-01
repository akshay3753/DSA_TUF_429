package ArrayMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix { // Classes usually start with a Capital letter in Java

    // This is the method that solves the problem
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {
            // 1. Move Right: across 'top' row
            for (int i = left; i <= right ; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // 2. Move Down: along 'right' column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // 3. Move Left: across 'bottom' row (Remember the 'safety brake'!)
            if(top <= bottom){
                for (int i = right; i >= left ; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // 4. Move Up: along 'left' column (Remember the 'safety brake'!)
            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    // This is where you can test your code
    public static void main(String[] args) {
        SpiralMatrix sol = new SpiralMatrix();
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sol.spiralOrder(testMatrix));
    }
}