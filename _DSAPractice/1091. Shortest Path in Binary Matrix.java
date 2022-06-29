class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if(grid[0][0] == 1 || grid[row-1][col-1] == 1) return -1;
        Queue<int[]> que = new LinkedList<>();
        int[][] dir = {{0,1},{0,-1},{-1,0},{1,0},{1,1},{1,-1},{-1,1},{-1,-1}};  //direction array
        que.offer(new int[]{0,0});
        grid[0][0]=1;
        while(!que.isEmpty()){
            int qSize = que.size();
            for(int q=0;q<qSize;q++){
                int []tmp = que.poll();
                if(tmp[0] == row - 1 && tmp[1] == col-1) return grid[tmp[0]][tmp[1]];
                for(int i = 0; i<8;i++){
                    int r = tmp[0] + dir[i][0], c = tmp[1] + dir[i][1];
                    if(r>=0 && r < row && c>=0 && c<col && grid[r][c] == 0){
                        que.offer(new int []{r,c});
                        grid[r][c]=grid[tmp[0]][tmp[1]]+1;
                    }
                }
            }
            
        }
        return -1;
    }
}
