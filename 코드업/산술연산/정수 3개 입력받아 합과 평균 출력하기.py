a, b, c = map(int, input().split())
Add = a + b + c
Average = (a + b + c)/3
print(f'{Add} {Average:.2f}')
#  print(Add, format(Average, ".2f"))

# print(f'{Add}{Average: .2f}'): 이렇게 작성하면 Average가 양수일 경우에는 앞 공백추가, 음수일때는 공백 안 추가

