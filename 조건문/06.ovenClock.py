'''

https://www.acmicpc.net/problem/2525

'''


h, m = input().split()
cookTime = int(input())

H = int(h)
M = int(m)

cookHour = cookTime // 60
cookMinute = cookTime % 60

H += cookHour
M += cookMinute

if M >= 60:
    H += 1
    M -= 60
if H >= 24:
    H -= 24

print(H, end=" ")
print(M)






