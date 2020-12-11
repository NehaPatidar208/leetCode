# mock01
#que02
"""
Input1: ["bella","label","roller"]
Output: ["e","l","l"]


Input: ["cool","lock","cook"]
Output: ["c","o"]
"""
from collections import Counter
def commonChars(A):
    a=Counter(A[0])
    for i in range(1,len(A)):
        a = a & Counter(A[i])
    return list(a.elements())
A=list(map(str,input().split()))
print(commonChars(A))
