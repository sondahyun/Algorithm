miropan = list()

for i in range(10):
    miro_row = list(map(int, input().split()))
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
        if miropan[i-1][j] == 1: 
            if miropan[i][j-1] == 1: 
                print("더이상 움직일 수 없음")
                break
            else:
                miropan[i-1][j-1] = 9
                i += 1
                print("아래쪽으로 이동") # 아래쪽 이동
        else:
            miropan[i-1][j-1] = 9
            j += 1
            print("오른쪽으로 이동") # 오른쪽 이동

for i in range(10):
    for j in range(10):
        print(miropan[i][j], end=" ")
    print()