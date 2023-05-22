'''

https://www.acmicpc.net/problem/3052

'''

import sys

arr = [0]*10
count = 10

for i in range(10):
    arr[i] = int(sys.stdin.readline())%42
    
arr = set(arr)  # set은 중복 허용 x

print(len(arr))