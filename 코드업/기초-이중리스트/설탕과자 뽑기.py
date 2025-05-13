h, w = map(int, input().split())
badokpan = [[0]*w for _ in range(h)]
# print(badokpan)

n = int(input())

stick = []
for _ in range(n):
    a = list(map(int, input().split()))
    if a[1] == 1: # 세로
        for i in range(a[0]):
            badokpan[a[2]-1+i][a[3]-1] = 1
    elif a[1] == 0: # 가로
        for i in range(a[0]):
            badokpan[a[2]-1][a[3]-1+i] = 1
    stick.append(a)

for i in range(h):
    for j in range(w):
        print(badokpan[i][j], end=" ")
    print()
