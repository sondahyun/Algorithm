import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

n, m = map(int, input().split())

won_list = []
dp = [10001] * (m+1)
dp[0] = 0


for i in range(n):
    a = int(input())
    won_list.append(a)

won_list.sort()

print(won_list)

for i in range(1, m+1):
    # i원까지 만들떄 사용하는 동전의 최소 횟수
    for j in range(n):
        if i >= won_list[j]:
            print(i, won_list[j])
            dp[i] = min(dp[i], dp[i-won_list[j]] + 1)
        else:
            continue

print(dp[m-1])
print(dp)
