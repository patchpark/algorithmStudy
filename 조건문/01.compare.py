'''

https://www.acmicpc.net/problem/1330

'''


a,b=input().split()
A=int(a)
B=int(b) 

if A>B:
 print(">")
elif A<B:
 print("<")
else:
 print("==")