class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
        long sum = 0;
        for(Integer i : target){
            q.offer(i);
            sum += i;
        }
        while(q.peek() != 1){
            int value = q.poll();
            sum -= value;
            if(sum == 1 || value == 1)return true;
            if(sum > value || sum == 0 || value % sum == 0) return false;
            value %= sum;
            sum += value;
            q.offer(value);
        }
        return true;
    }
}
