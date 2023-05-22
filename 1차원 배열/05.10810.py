'''

https://www.acmicpc.net/problem/10810


'''

import sys

basket, number = map(int, sys.stdin.readline().split())

arr = [0] * basket

for i in range(number):
    start, end, num = map(int, sys.stdin.readline().split())
    for j in range(start-1, end):
        arr[j] = num
        
for i in range(basket):
    print(arr[i], end=" ")
