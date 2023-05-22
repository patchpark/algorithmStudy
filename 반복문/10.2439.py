"""

https://www.acmicpc.net/problem/2439

"""

import sys

num = int(sys.stdin.readline())

for i in range(num):
    for j in range(num-i-1):
        print(" ", end="")
    for k in range(i+1):
        print("*", end="")
    print("")