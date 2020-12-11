# mock01
# que1

"""
Input1: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL",
each substring contains same number of 'L' and 'R'.


Input2: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR",
each substring contains same number of 'L' and 'R'.


Input3: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".


Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL",
since each substring contains an equal number of 'L' and 'R'
"""

class Solution:
    def balancedStringSplit(self, s: str) -> int:
        l=0
        r=0
        sm=0
        for i in range(len(s)):
            if l>0 and l==r:
                sm+=1
                l=0
                r=0
            if s[i]=='L':
                l+=1
            if s[i]=='R':
                r+=1
        if l==r:
            sm+=1
        return sm
        
