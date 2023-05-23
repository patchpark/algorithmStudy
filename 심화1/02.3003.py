# https://www.acmicpc.net/problem/3003

chess = [1,1,2,2,2,8]

found = list(map(int, input().split()))


for i in range(len(chess)):
    print(chess[i] - found[i], end=" ")
