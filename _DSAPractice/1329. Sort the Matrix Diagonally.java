class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length;
        for(int i=0;i<colLen;i++){
            sortHelper(mat,0,i,rowLen,colLen);
        }
        for(int i=1;i<rowLen;i++){
            sortHelper(mat,i,0,rowLen,colLen);
        }
        return mat;
    }
    
    void sortHelper(int ar[][], int row, int col, int lastRow, int lastCol){
        int []tmp  = new int [101];
        int c= col,r=row;
        while(row<lastRow && col < lastCol){
            tmp[ar[row][col]]++;
            row++;
            col++;
        }
        for(int i=1;i<101;i++){
            if(tmp[i]>0){
                while(tmp[i]-->0){
                    ar[r][c] = i;
                    r++;
                    c++;
                }
            }
        }
    }
}
