# https://www.acmicpc.net/problem/10988

word = input()

word_reverse = list(reversed(word))
    
if list(word) == word_reverse:
    print("1")
else:
    print("0")