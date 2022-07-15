class Solution {
    int helper(int arr[][],int r, int c,int count){
        if(r>=0 && r<arr.length && c>=0 && c<arr[0].length && arr[r][c] == 1){
            arr[r][c]=0;
            count++;
            count = helper(arr,r+1,c,count);
            count = helper(arr,r-1,c,count);
            count = helper(arr,r,c+1,count);
            count = helper(arr,r,c-1,count);
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    count = Math.max(count,helper(grid,i,j,0));
                }
            }
        }
        return count;
    }
}
