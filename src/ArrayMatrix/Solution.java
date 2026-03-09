package ArrayMatrix;
class Solution {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        int r = 0, c = 0;

        for (int i = 0; i < rows * cols; i++) {
            result[i] = matrix[r][c];

            if ((r + c) % 2 == 0) { // going up-right
                if (c == cols - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else { // going down-left
                if (r == rows - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;

    }
        public static void main (String[]args){
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[] result = findDiagonalOrder(matrix);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }