class Solution {
    boolean [] isvisited;
    public int minScore(int n, int[][] roads) {
        isvisited = new boolean[n+1];
        isvisited[1]=true;
        int temp_min = Integer.MAX_VALUE;
        List<List<int[]>> adList = new ArrayList<List<int[]>>();
        for(int i=0;i<=n;i++){
            adList.add(new ArrayList<int[]>());
        }
        for(int node[] : roads){
            int a[] = {node[1],node[2]};
            int b[] = {node[0],node[2]};
            adList.get(node[0]).add(a);
            adList.get(node[1]).add(b);
        }
        // int c=0;
        // for(List<int[]> lst : adList){
        //     System.out.println("\n"+c);
        //     for(int a[]:lst){
        //         if(a.length > 0){System.out.print( "["+a[0] + " " + a[1]+"]");}
        //     }
        //     c++;
        // }
        Deque<Integer> dq = new LinkedList<>();
        dq.offer(1);
        while(!dq.isEmpty()){
            int node = dq.poll();
            isvisited[node]=true;
            for(int cur[] : adList.get(node)){
                if(!isvisited[cur[0]]){
                    temp_min = Math.min(temp_min, cur[1]);
                    dq.offer(cur[0]);
                }
            }
        }
        return temp_min;
    }
}
