package ArrayMatrix;

public class spiralMatrix3 {
        public static int[][] spiralMatrix3(int rows, int cols, int rStart, int cStart) {
            int[][] result = new int[rows * cols][2];
            int index = 0;

            int r = rStart;
            int c = cStart;

            result[index++] =new int[]{r, c};

            int[][] directions = {
                    {0, 1}, {1, 0}, {0, -1}, {-1, 0}
            };

            int stepLength = 1;
            int dir = 0;

            while(index < rows * cols){
                for(int i = 0; i < 2; i++){
                    for (int j = 0; j < stepLength; j++) {
                        r += directions[dir][0];
                        c += directions[dir][1];

                        if(r >= 0 && r < rows && c >= 0 &&  c < cols){
                            result[index++] = new int[]{r, c};
                        }
                    }
                    dir = (dir + 1) % 4;
                }
                stepLength++;
            }
            return result;
        }
            public static void main (String[]args){
            // Write your solution here
            int rows = 5;
            int cols = 6;
            int rStart = 1;
            int cStart = 4;

            int[][] ans = spiralMatrix3(rows, cols, rStart, cStart);

            System.out.println("Spiral Order Coordinates:");

            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i][0] + " , " + ans[i][1]);
            }
        }
    }

