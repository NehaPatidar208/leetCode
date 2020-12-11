class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        l=[str(i+1) for i in range(n)]
        l.sort()
        for i in range(n):
            l[i]=int(l[i])
        return l
        

