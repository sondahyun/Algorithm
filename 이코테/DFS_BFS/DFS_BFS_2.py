import os
print("현재 작업 디렉토리:", os.getcwd())
print("input.txt 존재함?:", os.path.exists("input.txt"))

import sys
sys.stdin = open("input.txt", "r")

from collections import deque

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def bfs(i, j):
    global rslt
    queue = deque()
    queue.append((i,j))

    while queue: # 큐가 빌때까지
        x, y = queue.popleft()
        print(f"({x}, {y})")
        # 처음 시작값은 항상 1로 초기화 (x, y)가 아닌 (i, j)로 정한 이유
        pan[i][j] = 1
        for t in range(len(dx)):
            x1 = x + dx[t]
            y1 = y + dy[t]    
            
            if x1 == n-1 and y1 == m-1:
                queue.append((x1, y1)) 
                pan[x1][y1] = pan[x][y] + 1               
                return pan[x1][y1]
            if x1 <= -1 or y1 <= -1 or x1 >=n or y1 >= m:
                continue
            if pan[x1][y1] == 0:
                continue
            if pan[x1][y1] == 1:
                queue.append((x1, y1))
                pan[x1][y1] = pan[x][y] + 1               

    return pan[n-1][m-1] # 위에 if문 따로 안써도 됨         

n, m = map(int, input().split())

pan = []
for i in range(n):
    row = list(map(int, input()))
    pan.append(row)

for i in range(n):
    for j in range(m):
        print(pan[i][j], end="")
    print()
    
print(bfs(0, 0)) 

for i in range(n):
    for j in range(m):
        print(pan[i][j], end="")
    print()