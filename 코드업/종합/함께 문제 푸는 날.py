import math
a, b, c = map(int, input().split())
print(a*b*c/math.gcd(a, b, c))


"""
a, b, c = map(int, input().split())
d = 1
while True:
    if d % a == 0 and d % b == 0 and d % c == 0:
        print(d)
        break
    else:
        d+=1
"""
