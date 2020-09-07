def result(pattern, tmp):
    l=tmp.split()
    if len(pattern)!=len(l):
            return False
    d=dict()
    for i in range(len(pattern)):
        if(pattern[i] not in d):
            if l[i] in d.values():
                return False
            d.update({pattern[i]:l[i]})
        elif(d[pattern[i]] != l[i]):
            return False
    return True
s1=input()
s2=input()
print(result(s1,s2))
