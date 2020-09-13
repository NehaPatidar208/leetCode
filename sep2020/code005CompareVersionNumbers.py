class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        v1=list(map(int,version1.split(".")))
        v2=list(map(int,version2.split(".")))
        while len(v1)>0 and len(v2)>0:
            t1=v1.pop(0)
            t2=v2.pop(0)
            if(t1>t2):
                return 1
            elif t2>t1:
                return -1
        while len(v1)>0:
            t1=v1.pop(0)
            if t1>0:
                return 1
        while len(v2)>0:
            t2=v2.pop(0)
            if t2>0:
                return -1
        return 0
