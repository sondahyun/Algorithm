a, b, c = map(int, input().split())
sum = 0

for x in range(a):
    for y in range(b):
        for z in range(c):
            print(x, y, z)
            sum += 1

print(sum)