data = input()
result = []
value = 0

for x in data:
    if x.isalpha():
        result.append(x)
    else:
        value += int(x)

result.sort()

result.append(str(value))
# chr: 숫자 -> 유니코드 문자
# str: 문자열로 바꾸기

print("".join(result))