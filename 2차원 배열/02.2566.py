# https://www.acmicpc.net/problem/2566

a = [0] * 9

for i in range(9):
    a[i] = input().split()
    
maxRow = 0
maxColumn = 0
max = 0

for i in range(9):
    for j in range(9):
       if int(a[i][j]) >= max:
           max = int(a[i][j])
           maxRow = i+1
           maxColumn = j+1
           
print(max)
print(maxRow, end=" ")
print(maxColumn)