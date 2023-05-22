'''

https://www.acmicpc.net/problem/10809

'''

word = input()

for i in range(97, 123):
    count = 0
    for j in range(len(word)):
        if chr(i) == word[j]:
            print(j, end=" ")
            count = 1
            break
    if count == 0:
        print("-1", end=" ")
        
print("")
        
# 더 좋은 코드

for i in range(97, 123):
		print(word.find((chr(i))), end=" ")












