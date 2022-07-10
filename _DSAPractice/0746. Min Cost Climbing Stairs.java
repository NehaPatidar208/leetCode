/*
Approach 1:

Solution with manipulation in given array only.

TC - O(n)
SC - (1)
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n < 2) return 0;
        for(int i = 2; i < n; i++){
            cost[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }
}
/*
Approach2:

Solution with temp variables without manipulation in given array

TC - O(n)
SC - (1)
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n < 2) return 0;
        int f = 0, s = 0;
        for(int i = 2; i <= n; i++){
            int tmp= Math.min(f + cost[i - 1], s + cost[i - 2]);
            s = f;
            f = tmp;
        }
        return Math.max(f, s);
    } 
}
