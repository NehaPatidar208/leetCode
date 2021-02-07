n=int(input("Enter the size of square matrix"))
l=[]
for i in range(n):
    s=list(map(int,input().split()))    #taking input for each row
    l.append(s)

#backslash diagonal
b=0;
f=0
print(l)
for i in range(n):
    print(l[i][n-i-1],l[i][i])
    b=b+l[i][n-i-1]
    f=f+l[i][i]
print(f,b)
