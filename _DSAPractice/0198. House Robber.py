class Solution:
    def rob(self, nums: List[int]) -> int:
        r= 0
        r2= 0
        for i in nums:
            r,r2 = r2,max(r2,r+i)
        return max(r,r2)
