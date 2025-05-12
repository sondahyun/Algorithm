a = int(input())
x = list(map(int, input().split()))

list = [0]*23

for i in x:
    list[i-1] += 1

for i in list:
    print(i, end=" ")

"""
a = int(input())
x = list(map(int, input().split()))
c = dict()

for i in x:
    if i in c:
        c[i] += 1
    else:
        c[i] = 1

for i in range(1, 24):
    if i in c:
        print(c[i], end=" ")
    else: 
        print("0", end=" ")
"""