a = int(input())
x = list(map(int, input().split()))

for i in range(a-1, -1, -1):
    print(x[i], end=" ")


"""
a = int(input())
x = list(map(int, input().split()))

x.reverse()

for i in x:
    print(i, end=" ")
"""
