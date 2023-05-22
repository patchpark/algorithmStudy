# https://www.acmicpc.net/problem/10430


a, b, c = input().split()
A = int(a)
B = int(b)
C = int(c)
print((A+B)%C)
print(((A%C)+(B%C))%C)
print((A*B)%C)
print(((A%C)*(B%C))%C)
