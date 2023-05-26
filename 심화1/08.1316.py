# https://www.acmicpc.net/problem/1316

num = int(input())

word = [0]*num

check = False
count = num

for i in range(num):
    word[i] = input()

for k in range(len(word)):
	for i in range(len(word[k])-1):
		if word[k][i] != word[k][i+1]:
			for j in range(i+2, len(word[k])):
				if word[k][i] == word[k][j]:
					check = True					
	if check == True:
		count -= 1
		check = False

print(count)


# 더 깔끔한 코드

N = int(input())
cnt = N

for i in range(N):
    word = input()
    for j in range(0, len(word)-1):
        if word[j] == word[j+1]:
            pass
        elif word[j] in word[j+1:]:
            cnt -= 1
            break

print(cnt)