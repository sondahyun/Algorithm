a = int(input())

for i in range(1, a+1):
    flag = 0
    if i % 10 in [3, 6, 9]:
        print("X", end="")
        flag += 1
    if i // 10 in [3, 6, 9]:
        print("X", end="")
        flag += 1
    if flag == 0:
        print(i, end="")
    print(" ", end="")
