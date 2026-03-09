package ArrayMatrix;

import java.util.ArrayList;
import java.util.List;

public class setMatrixZeroes {
    public static void setMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1 - find all positions with 0
        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Step 2 - set entire row to 0
        for (int row : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }
        }

        // Step 3 - set entire column to 0
        for (int col : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
