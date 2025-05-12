a, r, n = map(int, input().split())

for i in range(2, n+1):
    a *= r
    n = i

print(a)