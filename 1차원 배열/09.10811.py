'''

https://www.acmicpc.net/problem/10811

'''

import sys

basket, number = map(int, sys.stdin.readline().split())

arr = [i for i in range(1,basket+1)]

for i in range(number):
    start, end = map(int, sys.stdin.readline().split())
    temp = arr[start-1:end] # 임시 배열 생성
    temp.reverse()          # 배열 뒤집기
    arr[start-1:end] = temp # 임시배열을 arr배열로 삽입

for i in range(basket):
    print(arr[i], end=" ")