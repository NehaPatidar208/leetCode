//
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int no_edge = connections.length;
        if(n>no_edge+1)return -1;
        List<Set<Integer>> adList = new ArrayList<Set<Integer>>();
        for(int i=0;i<n;i++){
            adList.add(new HashSet<Integer>());
        }
        for(int[]ed : connections){
            int u=ed[0], v = ed[1];
            adList.get(u).add(v);
            adList.get(v).add(u);
        }
        int no_graph = 0;
        Deque<Integer> dq = new LinkedList<>();
        
        boolean[]visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                no_graph++;
                dfs(i,adList,visited);
            }
        }
        return no_graph-1;
    }
    void dfs(int node , List<Set<Integer>> adList, boolean[]visited){
        if(visited[node])return;
        visited[node]=true;
        for(int i:adList.get(node)){
            if(!visited[i])dfs(i,adList,visited);
        }
    }
}

//////itrative
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int no_edge = connections.length;
        if(n>no_edge+1)return -1;
        List<Set<Integer>> adList = new ArrayList<Set<Integer>>();
        for(int i=0;i<n;i++){
            adList.add(new HashSet<Integer>());
        }
        for(int[]ed : connections){
            int u=ed[0], v = ed[1];
            adList.get(u).add(v);
            adList.get(v).add(u);
        }
        int no_graph = 0;
        Deque<Integer> dq = new LinkedList<>();
        
        boolean[]visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dq.offer(i);
                visited[i]=true;
                no_graph++;
                while(!dq.isEmpty()){
                    int node = dq.poll();
                    for(int cur:adList.get(node)){
                        if(!visited[cur]){
                            dq.offer(cur);
                            visited[cur]=true;
                        }
                    }
                }
            }
        }
        return no_graph-1;
    }
}
