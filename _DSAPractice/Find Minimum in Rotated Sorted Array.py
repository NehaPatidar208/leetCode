class Solution:
    def findMin(self, nums: List[int]) -> int:
        f=0
        l= len(nums)-1
        while f<=l:
            if f==l:
                return nums[f]
            m = (f+l)//2
            if nums[m]>nums[l]:
                f = m + 1
            else:
                l=m
                
        return nums[l]
        
