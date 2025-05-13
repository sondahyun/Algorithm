miropan = list()
miro_row = list(map(int, input().split()))
for i in range(10):
    miropan.append(miro_row)


i = 2
j = 2
while True:
    if i == 9 and j == 9:
        print("맨 아래의 가장 오른쪽에 도착")
        break
    elif miropan[i-1][j-1] == 2: # 현재 위치
        print("먹이를 찾았다")
        break
    elif miropan[i-1][j-1] == 0: # 현재 위치
        if miropan[i-1][j] == 1: # 오른쪽 이동
            if miropan[i][j-1] == 1: # 아래쪽 이동
                print("더이상 움직일 수 없음")
                break
            else:
                i += 1
                miropan[i-1][j-1] = 9
        else:
            j += 1
            miropan[i-1][j-1] = 9

for i in range(10):
    for i in range(10):
        print(miropan[i][j], end=" ")
    print()