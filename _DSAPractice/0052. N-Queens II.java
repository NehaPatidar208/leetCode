class Solution {
     boolean safeQueen(int r, int c, char[][] board, int n){
        for(int i=0;i<n;i++){
            for(int  j=0;j<c;j++){
                if(board[i][j]=='Q'&&((r==i)||(r+c == i+j) || (r+j == c+i)))return false;
            }
        }
        return true;
    }
    
    int helper(int col, char[][] board, int result, int n){
        if(col == n){
            return result +1;
        }
        for(int row = 0;row<n;row++){
            if(safeQueen(row,col,board,n)){
                board[row][col] = 'Q';
                result = helper(col+1,board,result,n);
                board[row][col] = '.';
            }
        }
        return result;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] c: board) Arrays.fill(c,'.');
        return helper(0,board,0,n);
    }
}
