badokpan = [[0]*19 for _ in range(19)] # 리스트 컴프리헨션 (2차원 리스트 생성)
white = int(input())
for i in range(white):
    x, y = map(int, input().split())
    badokpan[x-1][y-1] = 1

for i in range(19):
    for j in range(19):
        print(badokpan[i][j], end=" ")
    print()