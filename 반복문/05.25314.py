"""
문제

4바이트 마다 long 하나씩 출력
"""

byte = int(input())

for i in range(byte//4):
    print("long", end=" ")
print("int")