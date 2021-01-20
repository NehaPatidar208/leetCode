"""
1.
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

2.Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.

"""

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        r=1
        for i in range(-1,-len(digits)-1,-1):
            digits[i]+=r
            r=(digits[i])//10
            digits[i]%=10
            if r==0:
                break
        if r==1:
            digits=[1]+digits
        return digits
            
        
        
