'''

https://www.acmicpc.net/problem/11720

'''

num = int(input())

numToDivide = input()

divided = list(numToDivide)

total = 0

for i in range(num):
    total += int(divided[i])

print(total)

