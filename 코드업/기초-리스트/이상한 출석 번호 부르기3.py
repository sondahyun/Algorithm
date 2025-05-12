a = int(input())
list = list(map(int, input().split()))
min = 100000

for i in range(a):
    if min > list[i]:
        min = list[i]

print(min)