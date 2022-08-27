class Solution {
    boolean safeQueen(int r, int c, char[][] board, int n){
        int r1=r, c1=c;
        while(r>=0 && c>=0){
            if(board[r][c] == 'Q')return false;
            c--;
            r--;
        }
        r=r1;
        c=c1;
        while(c>=0){
            if(board[r][c] == 'Q')return false;
            c--;
        }
        r=r1;
        c=c1;
        while(r<n && c>=0){
            if(board[r][c] == 'Q')return false;
            c--;
            r++;
        }
        return true;
    }
    
    void helper(int col, char[][] board, List<List<String>> result, int n){
        if(col == n){
            result.add(construct(board));
            return;
        }
        for(int row = 0;row<n;row++){
            if(safeQueen(row,col,board,n)){
                board[row][col] = 'Q';
                helper(col+1,board,result,n);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        char[][] board = new char[n][n];
        for(char[] c: board) Arrays.fill(c,'.');
        helper(0,board,result,n);
        return result;
    }
    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
