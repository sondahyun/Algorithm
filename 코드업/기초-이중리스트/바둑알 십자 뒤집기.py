badokpan = []
for i in range(19):
    badokpan_row = list(map(int, input().split()))
    badokpan.append(badokpan_row)

# print(badokpan)
num = int(input())

for i in range(num):
    x, y = map(int, input().split())
    for j in range(19):
        badokpan[x][j] = 0 if badokpan[x][j] == 1 else 1
    for j in range(19):
        badokpan[j][y] = 0 if badokpan[j][y] == 1 else 1

for i in range(19):
    for j in range(19):
        print(badokpan[i][j], end=" ")
    print()