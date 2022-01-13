class Solution:
    def helper(self,arr,target):
        l=0
        r=len(arr)-1
        while l<=r:
            m=(r+l)//2
            if target == arr[m]: return True
            elif target<arr[m]:
                r = m-1
            else:
                l=m+1
        return False
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range (len(matrix)):
            if matrix[i][-1]>= target:
                return self.helper(matrix[i],target)
        return False
        
        
