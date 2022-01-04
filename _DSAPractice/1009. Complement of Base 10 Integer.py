class Solution:
    def helper(self,n,p):
        if n == 0:
            return 0
        r= 1
        while p:
            r=r*2
            p-=1
        return r
    def bitwiseComplement(self, n: int) -> int:
        if n==0:
            return 1
        l=[]
        while n > 0:
            l.append(n%2)
            n=n//2
        res = 0
        print(l)
        for i in range(len(l)):
            if l[i] == 0:
                l[i]=1
            else:
                l[i]=0
            #print("Pre re : "+str(res)+ " pow : "+str(self.helper(l[i],i)))
            res+= (self.helper(l[i],i))
            #print("res : "+str(res))
        return res
        
