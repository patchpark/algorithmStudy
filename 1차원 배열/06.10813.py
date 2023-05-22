'''

https://www.acmicpc.net/problem/10813


'''

import sys

basket, number = map(int, sys.stdin.readline().split())

arr = [0] * basket


for i in range(basket):
    arr[i] = i+1;

for i in range(number):
    b1, b2 = map(int, sys.stdin.readline().split())
    temp = arr[b1-1]
    arr[b1-1] = arr[b2-1]
    arr[b2-1] = temp
    
for i in range(basket):
    print(arr[i], end=" ")