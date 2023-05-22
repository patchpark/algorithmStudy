"""

https://www.acmicpc.net/problem/2562

"""
import sys

max = 0
max_arr = 0
arr = [0]*9


for i in range(9):
    arr[i] = int(sys.stdin.readline())
    if arr[i]>max:
        max = arr[i]
        max_arr = i+1
        
print("%d\n%d" %(max, max_arr))