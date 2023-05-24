# https://www.acmicpc.net/problem/4344

num = int(input())


for i in range(num):
		input1 = list(map(int, input().split()))
		total = 0
		count = 0
		for j in range(1, len(input1)):
			total += input1[j]
		avg = total/input1[0]
		for i in range(1, len(input1)):
			if(input1[i]>avg):
				count += 1
		
		print(f"{count/input1[0]*100:.3f}%")
