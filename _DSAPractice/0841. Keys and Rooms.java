class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean []isVisited = new boolean[n];
        isVisited[0]=true;
        Queue<Integer> que = new LinkedList<>();
        for(int i:rooms.get(0)){
            que.offer(i);
        }
        while(que.size()>0){
            int cur = que.poll();
            isVisited[cur]=true;
            for(int i: rooms.get(cur)){
                if(!isVisited[i]){
                    que.offer(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!isVisited[i])return false;
        }
        return true;
    }
}
