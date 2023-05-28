# https://www.acmicpc.net/problem/10798

a = [[-1 for j in range(15)] for i in range(5)] 
b=[0]*5

for i in range(5):
    b[i] = list(input())
    
for i in range(5):
    for j in range(len(b[i])):
        a[i][j] = b[i][j]

for j in range(15):
    for i in range(5):
        if a[i][j] != -1:
            print(a[i][j], end= '')

