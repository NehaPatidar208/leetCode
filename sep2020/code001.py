class Solution:
    def repeatedSubstringPattern(self, st: str) -> bool:
        if(len(st)<2):
            return False
        n=1
        while(n<=len(st)//2):
            s=st[:n]
            flag=0
            for i in range(n,len(st),n):
                if(s==st[i:i+n]):
                    flag=1
                else:
                    flag=0
                    break
            if flag==1:
                return True
            else:
                n+=1
        return False
s=input()
sl=Solution()
print(sl.repeatedSubstringPattern(s))
