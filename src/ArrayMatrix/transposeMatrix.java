package ArrayMatrix;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];

        // your code here!
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        // print result
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}