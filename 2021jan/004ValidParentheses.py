class Solution:
    def isValid(self, s: str) -> bool:
        if len(s)%2 ==1:
            return False
        t=[]
        for i in s:
            if i in "([{":
                t.append(i)
            elif len(t)!=0 and i =='}' and t[-1] =='{':
                t.pop(-1)
            elif len(t)!=0 and i ==')' and t[-1] =='(':
                t.pop(-1)
            elif len(t)!=0 and i ==']' and t[-1] =='[':
                t.pop(-1)
            else:
                return False
        if len(t)>0:
            return False
        return True
