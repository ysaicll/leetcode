public class Solution {
    public int countBattleships(char[][] board) {
      int res = 0, height = board.length, width = board[0].length, i, j;
        for (i = 0; i < height; i++)
            for (j = 0; j < width; j++) {
                if (board[i][j] == '.' || (i > 0 && board[i - 1][j] == 'X')
                        || j > 0 && board[i][j - 1] == 'X')
                    continue;
                res++;
            }
        return res;  
    }
}