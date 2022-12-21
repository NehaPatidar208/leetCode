class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int []color = new int[n];
        List<List<Integer>> adjList = new ArrayList<List<Integer>>();
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<Integer>());
        }
        for(int i=0;i<dislikes.length;i++){
            int x = dislikes[i][0]-1;
            int y = dislikes[i][1]-1;
            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }
        Arrays.fill(color,-1);
        System.out.println(adjList);
        int i=0;
        while(i<n){
            if(color[i] == -1){
                color[i]=1;
                que.offer(i);
                while(que.size()>0){
                    int cur = que.poll();
                    for(int next : adjList.get(cur)){
                        System.out.println(cur + " " + color[cur] + "  "+ next + " "+ color[next]);
                        if(color[next] == -1){
                            color[next] = 1 - color[cur];
                            que.offer(next);
                        }else if(color[next] == color[cur])return false;
                    }
                }
            }
            i++;
        }
        
        return true;
    }
}
