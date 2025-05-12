a, m, d, n = map(int, input().split())

for i in range(2, n+1):
    a = a * m + d
    n = i

print(a)