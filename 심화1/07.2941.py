# https://www.acmicpc.net/problem/2941


alphabet = ["c=", 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

count = 0

word = input()



for i in range(len(alphabet)):
		start = 0
		for j in range(len(word)):
			k = word.find(alphabet[i], start)
			if k != -1:
				start = k + 1
				count += 1
				

print(len(word)-count)

# 더 간단한 풀이

croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = input()

for i in croatia :
    word = word.replace(i, '*') 
print(len(word))