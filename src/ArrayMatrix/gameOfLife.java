package ArrayMatrix;

public class gameOfLife {
    public void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;

        int[][] newBoard = new int[m][n] ;

        int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] cols = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                for (int k = 0; k < 8; k++) {
                    int newRow = i + rows[k];
                    int newCol = j + cols[k];
                    if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n){
                      liveNeighbors += board[newRow][newCol];
                    }
                }
                if(board[i][j] == 1){
                    if(liveNeighbors < 2 || liveNeighbors > 3){
                        newBoard[i][j] = 0;  // dies
                    } else {
                        newBoard[i][j] = 1;  // stays alive
                    }
                } else {
                    if(liveNeighbors == 3){
                        newBoard[i][j] = 1;  // becomes alive
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = newBoard[i][j];
            }
        }

    }
    public static void main(String[] args) {
        // Write your solution here
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        gameOfLife game = new gameOfLife();
        game.gameOfLife(board);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }
}
