a = ord(input()) # 문자 -> 유니코드
b = 97

while a >= b:
    print(chr(b)) # 유니코드 -> 문자
    b += 1
