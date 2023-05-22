'''

https://www.acmicpc.net/problem/2884


'''


h, m = input().split()
H = int(h)
M = int(m)

if M >= 45:
    print(H, end=" ")
    print(M-45)
elif H == 0:
    print("23", end=" ")
    print(15+M)
else:
    print(H-1, end=" ")
    print(15+M)




