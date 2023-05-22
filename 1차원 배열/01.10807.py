"""

https://www.acmicpc.net/problem/10807

"""

import sys

size = int(sys.stdin.readline())

arr = [0] * size

arr = list(map(int, sys.stdin.readline().split()))

targetNum = int(sys.stdin.readline())
count = 0

for i in range(size):
    if arr[i] == targetNum:
        count += 1
        
print(count)


# 더 효율 적인 코드


size = int(input())
arr = list(map(int, input().split()))
v = int(input())

print(arr.count(v))