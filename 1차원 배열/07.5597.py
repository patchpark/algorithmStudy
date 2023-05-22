'''

https://www.acmicpc.net/problem/5597

'''

import sys

arr = [0] *30

for i in range(30):
    arr[i] = i+1
    
for i in range(28):
    targetNum = int(sys.stdin.readline())
    arr.remove(targetNum)
    
print("%d\n%d" %(arr[0],arr[1]))