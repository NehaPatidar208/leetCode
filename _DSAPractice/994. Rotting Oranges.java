class Solution {
    static int M=0, N=0;
    private static boolean isValid(int i ,int j){
        if (i<0 ||j <0 ||i >=M || j >=N) return false;
        return true;
    }
    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) return -1;
        this.M = grid.length;
        this.N = grid[0].length;
        Queue<Pair<Integer,Integer>> temp = new LinkedList<>();
        int result = 0;
        for(int i = 0;i<M;i++){
            for ( int  j = 0;j < N;j++){
                if (grid[i][j] == 2){
                    temp.add(new Pair(i,j));
                }
            }
        }
        while (temp.size()>0){
            boolean flag = false;
            int g= temp.size();
            for (int t = 0; t <g ;t++){
                Pair <Integer,Integer> pair = temp.remove();
                int i = pair.getKey(), j = pair.getValue();
                if(isValid(i+1,j) && grid[i+1][j] == 1){
                    flag = true;
                    grid[i+1][j] = 2;
                    temp.add(new Pair(i+1,j));
                }
                if(isValid(i-1,j) && grid[i-1][j] == 1){
                    flag = true;
                    grid[i-1][j] = 2;
                    temp.add(new Pair(i-1,j));
                  }
                if(isValid(i,j+1) && grid[i][j+1] == 1){
                    flag = true;
                    grid[i][j+1] = 2;
                    temp.add(new Pair(i,j+1));
                }
                if(isValid(i,j-1) && grid[i][j-1] == 1){
                    flag = true;
                    grid[i][j-1] = 2;
                    temp.add(new Pair(i,j-1));
                }
            }
            
            if (flag) result+=1;
        }
        for(int i = 0;i < M; i++){
            for (int j = 0;j <N; j++){
                if (grid[i][j] == 1) return -1;
            }
        }
        return result;
    }
}
