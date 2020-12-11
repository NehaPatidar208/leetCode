class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res=0
        t=''
        i=0
        j=0
        while (i<len(s) and j<len(s)):
            if s[j] in t:
                t=''
                i+=1
                if i==len(s):
                    return res
            if len(t)==0:
                j=i
            if s[j] not in t:
                t+=s[j]
                j+=1
            res=max(res,len(t))
        return res
sl=Solution()

st=input()
print(sl.lengthOfLongestSubstring(st))
