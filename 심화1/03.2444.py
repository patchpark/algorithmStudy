# https://www.acmicpc.net/problem/2444

a = int(input())

for i in range(a):
    print(" " * (a-1-i), end="")
    print("*" * (2*i + 1))

for i in range(a-2, -1, -1):
    print(" " * (a-1-i), end="")
    print("*" * (2*i + 1))