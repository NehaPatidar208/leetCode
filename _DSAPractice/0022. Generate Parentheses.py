class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans=[]
        def helper(o,c,s):
            if not o and not c:
                ans.append(s)
                return 
            if o:
                helper(o-1,c,s+'(')
            if c>o:
                helper(o,c-1,s+')')
        helper(n,n,'')
        return ans
