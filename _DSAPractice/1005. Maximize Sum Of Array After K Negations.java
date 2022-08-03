class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int sum=0;
        for(Integer i : nums){
            q.add(i);
        }
        while(k-->0)q.add(-q.poll());
        while(!q.isEmpty()){
            sum+=q.poll();
        }
        return sum;
    }
}
