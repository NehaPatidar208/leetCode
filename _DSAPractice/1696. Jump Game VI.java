class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> deq = new LinkedList();
        deq.offer(0);
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[deq.peekFirst()];
            while(!deq.isEmpty() && nums[i]>= nums[deq.peekLast()])deq.pollLast();
            deq.offerLast(i);
            if(i >= k+deq.peekFirst())deq.pollFirst();
        }
        return nums[n-1];
    }
}
