import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

n = int(input())
k = list(map(int, input().split()))

# DP 테이블
d = [0] * n
# DP 진행 (Bottom up)
d[0] = k[0]
d[1] = max(k[0], k[1])

# i번까지의 최대값 = max(i-1번까지의 최대값, i-2번까지의 최대값 + 현재값)
for i in range(2, n):
    print(max(d[i-1], d[i-2] + k[i]))
