# https://www.acmicpc.net/problem/25206

alphabetGrade = ['A+','A0','B+','B0','C+', 'C0', 'D+', 'D0', 'F']
numGrade = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]

totalGrade = 0
totalTime = 0

for i in range(20):
    name, time, grade = input().split()
    time1 = float(time)
    if grade != 'P':
        totalTime += time1
        for j in range(len(alphabetGrade)):
            if alphabetGrade[j] == grade:
               totalGrade += (time1 * numGrade[j])



average = totalGrade/totalTime

print(f'{average:.5f}')