# https://www.acmicpc.net/problem/2738


a, b = map(int, input().split())

c = [0] * a
d = [0] * a

for i in range(a):
    c[i] = input().split()
    
for i in range(a):
    d[i] = input().split()
    
for i in range(a):
    for j in range(b):
        print(int(c[i][j])+int(d[i][j]), end=" ")
    print("")
