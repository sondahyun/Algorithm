T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    sum = 0
    list1 = list(map(int, input().split()))
    for i in list1:
        if i % 2 == 0:
            continue
        else:
            sum += i
    print(f'#{test_case} {sum}')