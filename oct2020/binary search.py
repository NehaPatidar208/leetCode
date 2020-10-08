class Solution:
    def search(self, nums: List[int], target: int) -> int:
        f=0
        l=len(nums)-1
        while f<=l:
            mid=(f+l)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]<target:
                f=mid+1
            else:
                l=l-1
        return