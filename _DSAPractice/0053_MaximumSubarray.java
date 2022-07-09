class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,max=nums[0],prev=nums[0];
        for(int i=1;i<n;i++){
            prev= nums[i]+Math.max(prev,0);
            max=Math.max(max,prev);
        }
        return max;
    }
}
