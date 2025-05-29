import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")
# from collections import deque


t = int(input())
for test_case in range(1, t + 1):
    # n명, 유료p원, 무료 광고 개당 b원
    n, p, b = map(int, input().split())
    A = list(map(int, input().split()))

    max_A = max(A)
    max_profit = 0

    # 각 경우의 수
    for i in range(max_A+2):
        profit = 0

        # 사용자 마다 검사
        for j in range(n):
            if A[j] >= i:  # 무료 버전 사용
                profit += b * i
            elif A[j] < i:
                profit += p
        if max_profit < profit:
            max_profit = profit

    # 결과 출력
    print("#%d %d" % (test_case, max_profit))
