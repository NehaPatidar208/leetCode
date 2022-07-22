class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0)return 0;
        if(stones.length == 1)return stones[0];
        PriorityQueue<Integer> q= new PriorityQueue<>((a,b) ->b-a);
        for(int i:stones){
            q.add(i);
        }
        while(q.size()>1){
            q.add(q.poll() - q.poll());
        }
        return q.poll();
    }
}
