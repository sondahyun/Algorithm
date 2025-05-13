a = int(input())
list = list(map(int, input().split()))
min = 100000

for i in range(a):
    if min > list[i]:
        min = list[i]

print(min)

# 보통 파이썬에서 
# 가장 큰 값은 max_value = 10**9 (10억)
# 가장 작은 값은 min_value = -10**9 (-10억)