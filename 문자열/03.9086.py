'''

https://www.acmicpc.net/problem/9086

'''
import sys

number = int(sys.stdin.readline())
arr = [0]*number


for i in range(number):
    arr[i] = sys.stdin.readline().rstrip()
    
for i in range(number):
    print("%s%s" %(arr[i][0], arr[i][len(arr[i])-1]))
    
# arr[-1]은 마지막 값을 가져옴