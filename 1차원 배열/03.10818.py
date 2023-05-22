'''

https://www.acmicpc.net/problem/10818

'''

import sys

size = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

max = arr[0]
min = arr[0]

for i in range(size):
    if arr[i]>max:
        max = arr[i]
    if arr[i]<min:
        min = arr[i]
print("%d %d" %(min, max))