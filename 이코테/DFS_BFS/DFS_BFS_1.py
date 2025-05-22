# DFS
import sys
sys.stdin = open("input.txt", "r")

dx = [0 , 1, 0, -1]
dy = [1, 0, -1, 0]

def dfs(pan, i, j): # pan, (i, j) -> 현재 위치
    pan[i][j] = 1
    print(f"({i},{j})", end=" ")
    for t in range(len(dx)):
        x = i + dx[t]
        y = j + dy[t]
        if x >= 0 and x < len(pan) and y >= 0 and y < len(pan[i]) and pan[x][y] == 0:
            dfs(pan, x, y)

# pan 생성
n, m = map(int, input().split())
pan = []
for i in range(n):
    row = list(map(int, input())) # 입력받은 문자열을 한 글자씩 읽어서, 각 문자를 int로 변환하여 리스트로 저장
    # row = list(map(int, input().split()))
    pan.append(row)

rst = 0

for i in range(n):
    for j in range(m):
        if pan[i][j] == 0:
           dfs(pan, i, j)
           rst += 1

print(rst)






# # BFS
# import sys
# sys.stdin = open("input.txt", "r")

# from collections import deque

# dx = [0 , 1, 0, -1]
# dy = [1, 0, -1, 0]

# def bfs(pan, i, j):
#     queue = deque()
#     queue.append((i, j))
#     pan[i][j] = 1
#     print(len(pan[i]), len(pan))
#     while queue: # queue가 빌때까지
#         v = queue.popleft()
#         print(v, end=" ")
#         # 주변 v queue에 삽입
#         for t in range(len(dx)):
#             x = v[0] + dx[t]
#             y = v[1] + dy[t]
            
#             if x >= 0 and x < len(pan) and y >= 0 and y < len(pan[i]) and pan[x][y] == 0:
#                 queue.append((x, y))
#                 pan[x][y] = 1
#     print()

# n, m = map(int, input().split())
# pan = []
# for i in range(n):
#     row = list(map(int, input().split()))
#     pan.append(row)

# rst = 0

# for i in range(n):
#     for j in range(m):
#         if pan[i][j] == 0:
#            bfs(pan, i, j)
#            rst += 1

# print(rst)
