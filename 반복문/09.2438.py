"""

https://www.acmicpc.net/problem/2438


"""

import sys

num = int(sys.stdin.readline())

for i in range(1, num+1):
    for j in range(i):
        print("*", end="")
    print("")