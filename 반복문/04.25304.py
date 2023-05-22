'''

https://www.acmicpc.net/problem/25304


'''

total = int(input())
count = int(input())
sum = 0

for i in range(count):
    a, b = map(int, input().split())
    m = a * b
    sum += m
    
if total == sum:
    print("Yes")
else:
    print("No")