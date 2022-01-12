class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        def  helper(st,i):
            if (i==len(s)):
                res.append(st)
            else:
                if s[i].isalpha():
                    helper(st+s[i].swapcase(),i+1)
                helper(st+s[i],i+1)
        res=[]
        helper('',0)
        return res
