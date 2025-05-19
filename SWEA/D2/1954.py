# 달팽이 숫자
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    pan = [[0]*n for _ in range(n)]
    i = 0
    j = 0
    value = 1

    while True:
        for j in range(n):
            pan[i][j] = value
            print(f"[{i}][{j}] {value}")
            value += 1
            if value == n*n:
                break
        for i in range(i+1, n):
            pan[i][j] = value
            print(f"[{i}][{j}] {value}")
            value += 1
            if value == n*n:
                break
        for j in range(j-1, -1, -1):
            pan[i][j] = value
            print(f"[{i}][{j}] {value}")
            value += 1
            if value == n*n:
                break 
        for i in range(i-1, 0, -1):
            pan[i][j]  = value
            print(f"[{i}][{j}] {value}")
            value += 1
            if value == n*n:
                break
        n /= 2

               