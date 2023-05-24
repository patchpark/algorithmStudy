# https://www.acmicpc.net/problem/1157

alphabet=list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
word = input().upper()
count = [0]*26


for i in range(len(word)):
		for j in range(len(alphabet)):
				if word[i] == alphabet[j]:
					count[j] += 1

max = 0

for i in range(len(count)):
	if count[i] > max:
		max = count[i]
		max_index = i

check = 0
for i in range(len(count)):
	if count[i] == max:
		check += 1

if check==1:
	print(alphabet[max_index])
else:
	print("?")