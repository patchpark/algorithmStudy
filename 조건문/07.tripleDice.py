"""

https://www.acmicpc.net/problem/2480

"""

a, b, c = map(int,input().split())
if a == b and b == c:
  print(a*1000+10000)
elif a == b or b == c:
  print(1000+b*100)
elif c == a:
  print(1000+a*100)
else:
	print(max(a, b, c)*100) # 큰 수를 고르는 함수
