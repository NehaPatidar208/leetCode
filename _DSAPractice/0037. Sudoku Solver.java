class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char val='1';val<='9';val++){
                        if(isValid(board,i,j,val)){
                            board[i][j]=val;
                            if(solve(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValid(char[][] board, int r, int c, char val){
        for(int i=0;i<9;i++){
            if(board[i][c]==val)return false;
            if(board[r][i]==val)return false;
            if(board[3*(r/3)+i/3][3*(c/3)+i%3] == val)return false;
        }
        return true;
    }
}
