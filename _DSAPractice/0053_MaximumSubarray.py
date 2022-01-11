class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        mx = max(nums)
        sm = 0
        for i in range(len(nums)):
            sm+=nums[i]
            mx= max(mx,sm)
            sm=max(sm,0)
        return mx
            
        
