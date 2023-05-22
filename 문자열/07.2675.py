'''

https://www.acmicpc.net/problem/2675

'''

count = int(input())


for i in range(count):
	num, wordToRepeat = input().split()
	for i in wordToRepeat:
		for j in range(int(num)):
			print(i, end="")
	print("")
