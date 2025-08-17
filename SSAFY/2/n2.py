import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

# a에서 b로 이동 (크기는 m)
def distance(a, b, m):
    return (b - a + m)%m


t = int(input())
for test_case in range(1, t + 1):
    # n: 방문할 칸 수, m: 전체 원형 칸 수
    n, m = map(int, input().split())
    n_list = list(map(int, input().split()))

    total_dis = 0
    dist = []

    # 전체 거리 및 구간 거리 계산
    for i in range(n - 1):
        d = distance(n_list[i], n_list[i + 1], m)
        dist.append(d) 
        total_dis += d

    # 한 칸 제거 후 최소 거리 탐색
    min_dis = total_dis
    for i in range(1, n - 1):
        removed = dist[i - 1] + dist[i]
        added = distance(n_list[i - 1], n_list[i + 1], m)
        new_total = total_dis - removed + added
        min_dis = min(min_dis, new_total)

    print("#%d %d" % (test_case, min_dis))


