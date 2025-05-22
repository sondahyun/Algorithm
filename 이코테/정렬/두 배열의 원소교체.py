import sys
sys.stdin = open("input.txt", "r")

n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a_sort = sorted(a)
b_sort = sorted(b, reverse=True)

for i in range(k):
    if a_sort[i] < b_sort[i]:
        a_sort[i], b_sort[i] = b_sort[i], a_sort[i]

print(sum(a_sort))