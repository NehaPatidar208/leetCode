class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat)==0:
            return mat
        if r==len(mat) and c == len(mat[0]):
            return mat
        if r * c != len(mat) * len(mat[0]):
            return mat
        q=deque()
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                q.append(mat[i][j])
        newMat=[]
        for i in range(r):
            tmp=[]
            for j in range (c):
                tmp.append(q.popleft())
            newMat.append(tmp)
        return newMat
