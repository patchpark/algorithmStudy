'''

https://www.acmicpc.net/problem/1546


'''

import sys

number = int(sys.stdin.readline())

arr = [0] * number

arr = list(map(int, sys.stdin.readline().split()))

max = max(arr)
total = 0

for i in range(number):
    arr[i] = arr[i]/max * 100
    total += arr[i]
    
print(total/number)
