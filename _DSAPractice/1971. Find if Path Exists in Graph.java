class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)return true;
        boolean[] isVisited = new boolean[n];
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int [] node:edges){
            
            list.get(node[0]).add(node[1]);
            list.get(node[1]).add(node[0]);
        }
        Queue<Integer> que = new LinkedList<>();
        que.offer(source);
        while(que.size()!=0){
            int cur = que.poll();
            if(isVisited[cur] == false){
                for(int node : list.get(cur)){
                    if(node == destination)return true;
                    que.offer(node);
                }
            }
            isVisited[cur]=true;
        }
        return false;
    }
}
