class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        mx=nums.copy()
        mn=nums.copy()
        for i in range(1,len(nums)):
            mx[i]=max(mx[i-1]*nums[i],mn[i-1]*nums[i],nums[i])
            mn[i]=min(mx[i-1]*nums[i],mn[i-1]*nums[i],nums[i])
        return max(mx)
        
