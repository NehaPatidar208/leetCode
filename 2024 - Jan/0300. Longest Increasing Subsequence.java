class Solution {
    public int lengthOfLIS(int[] nums) {
        int result =0, n=nums.length;
        int [] lis = new int[n];
        lis[0] = 1;
        for(int i=1;i<n;i++){
            lis[i] = 1;
            for(int j=0;j<=i;j++){
                if(nums[j]<nums[i] && lis[i]<lis[j]+1) lis[i]=lis[j]+1;
            }
        }
        for(int i=0;i<n;i++){
            result=Math.max(result,lis[i]);
        }
        return result;
    }
}
