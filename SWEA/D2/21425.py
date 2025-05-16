t = int(input()) # test 케이스의 수
for i in range(t):
    a, b, n = map(int, input().split())
    s = 0
    while a <= n and b <= n:
        if a >= b:
            b += a
            s += 1
        else:
            a += b
            s += 1
    print(s)
        
    