# https://www.acmicpc.net/problem/2908

a, b = input().split()

reverseA =''
reverseB =''

for c in a:
    reverseA = c + reverseA

for c in b:
    reverseB = c + reverseB

if(int(reverseB)>= int(reverseA)):
    print(reverseB)
else:
    print(reverseA)
    