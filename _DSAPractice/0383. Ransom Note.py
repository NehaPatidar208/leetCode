class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        d={}
        for i in ransomNote: 
            if i in d:
                d.update({i:d[i]+1})
            else:
                d.update({i:1})
        for i in magazine:
            if len(d) == 0:
                return True
            if i in d:
                if d[i]!=1:
                    d.update({i:d[i]-1})
                else:
                    del d[i]
        if len(d) == 0:
            return True
        return False
                    
        
