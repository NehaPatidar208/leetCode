class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        a=[]
        for i in range (numRows):
            t=[]
            for j in range(i+1):
                if j==0 or j==i:
                    t.append(1)
                else:
                    t.append(a[i-1][j-1]+a[i-1][j])
            a.append(t)
        return a
