import sys
sys.stdin = open("input.txt", "r")

from collections import deque

dx = [0 , 1, 0, -1]
dy = [1, 0, -1, 0]

def bfs(pan, i, j):
    queue = deque()
    queue.append((i, j))
    pan[i][j] = 1
    print(len(pan[i]), len(pan))
    while queue: # queue가 빌때까지
        v = queue.popleft()
        print(v, end=" ")
        # 주변 v queue에 삽입
        for t in range(len(dx)):
            x = v[0] + dx[t]
            y = v[1] + dy[t]
            
            if x >= 0 and x < len(pan) and y >= 0 and y < len(pan[i]) and pan[x][y] == 0:
                queue.append((x, y))
                pan[x][y] = 1
    print()

n, m = map(int, input().split())
pan = []
for i in range(n):
    row = list(map(int, input().split()))
    pan.append(row)

rst = 0

for i in range(n):
    for j in range(m):
        if pan[i][j] == 0:
           bfs(pan, i, j)
           rst += 1

print(rst)
