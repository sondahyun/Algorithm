a = int(input(), 16)
for i in range(1, 16):
    # print("%X*%X=%X" % (a, i, a*i))
    print(f'{a:X}*{i:X}={a*i:X}')