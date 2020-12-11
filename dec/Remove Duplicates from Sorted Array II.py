class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<=2:
            return len(nums)
        i=2
        while i<len(nums):
            if nums[i] == nums[i-2]:
                nums.pop(i)
            else:
                i+=1
        return len(nums)
