import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

x = int(input())

dp = [0]*30001

dp[0] = 0
dp[1] = 0

for i in range(x):
    dp[i] = dp[i-1] + 1
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i//2] + 1)
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i//3] + 1)
    if i % 5 == 0:
        dp[i] = min(dp[i], dp[i//5] + 1)

print(dp[x-1])
