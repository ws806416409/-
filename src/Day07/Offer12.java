package Day07;

import java.util.Arrays;

/**
 * @author lemon
 * @date 2022/1/17 20:51
 * @blog www.lemonws.top
 */

public class Offer12 {
    static int[][] dd = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    static int row, column;
    boolean[][] vis = new boolean[210][210];
    public boolean dfs(int x, int y, char[][] m, String word, String now){
        vis[x][y] = true;
        now += m[x][y];
        if (now.equals(word)){
            return true;
        }
        char next = word.charAt(now.length());
        for(int i = 0; i < 4; i++){
            int dx = x + dd[i][0];
            int dy = y + dd[i][1];
            if(dx >=0 && dx < row && dy >=0 && dy < column && m[dx][dy] == next && !vis[dx][dy]){
                if(dfs(dx, dy, m, word, now)) return true;
            }
        }
        vis[x][y] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        column = board[0].length;
        row = board.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(i, j, board, word, ""))return true;
                }
            }
        }
        return false;
    }
}
