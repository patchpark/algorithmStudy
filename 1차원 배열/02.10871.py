'''

https://www.acmicpc.net/problem/10871

'''

import sys

size, num = map(int, sys.stdin.readline().split())

arr = list(map(int, input().split()))

for i in range(size):
    if arr[i] < num:
        print(arr[i], end=" ")