a, b, c = map(int, input().split())
d = 1
while True:
    if d % a == 0 and d % b == 0 and d % c == 0:
        print(d)
        break
    else:
        d+=1

# 여러개의 숫자는 math 라이브러리를 이용할 수 없음 (python 기본 math.gcd()는 인자가 2개까지 가능)