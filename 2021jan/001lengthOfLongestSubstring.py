
def lengthOfLongestSubstring(s):
    pre=[-1]*256
    j=0
    res=0
    for i in range(len(s)):
        j=max(j,pre[ord(s[i])]+1)
        mx=i-j+1
        pre[ord(s[i])]=i
        res=max(res,mx)
    return res
s=input()
print(lengthOfLongestSubstring(s))
