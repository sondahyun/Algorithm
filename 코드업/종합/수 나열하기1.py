a, d, n = map(int, input().split())
for i in range(2, n+1):
    a += d
    n = i
print(a)