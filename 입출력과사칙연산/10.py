# https://www.acmicpc.net/problem/2588


a = int(input())
b= input()

a1 = a * int(b[2])
a10 = a * int(b[1])
a100 = a * int(b[0])
print(a1)
print(a10)
print(a100)
print(a1 + a10 * 10 + a100 * 100)

