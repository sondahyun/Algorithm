# 파라메트릭 서치: 최적화 문제 (가장 ~한 수)를 결정문제로 바꿔서 해결하는 기법
import sys
import os
print("현재 작업 디렉토리:", os.getcwd())
print("input.txt 존재함?:", os.path.exists("input.txt"))

sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")


n, m = map(int, input().split())
ddeok = list(map(int, input().split()))

ddeok.sort()

print(ddeok)


# 재귀문

result = 0
mid = 0


def recursive_func(start, end):
    global result, mid
    rslt = 0
    middle = (start + end) // 2
    for i in range(n):
        if ddeok[i] < middle:
            continue
        rslt += ddeok[i] - middle
    if start > end:
        return result, mid
    # if rslt == m:
    #     return rslt
    # el
    if rslt >= m:
        result = rslt
        mid = middle
        return recursive_func(middle + 1, end)
    elif rslt < m:
        return recursive_func(start, middle - 1)


recursive_func(0, ddeok[n-1])
print(result, mid)


# # 반복문
# while start <= end:
#     rslt = 0
#     middle = (start + end) // 2
#     for i in ddeok:
#         if i < middle:
#             continue
#         rslt += i - middle
#     if rslt < m:
#         end = middle - 1
#     if rslt > m:
#         start = middle + 1
#     if rslt == m:
#         break

# print(f"떡의 양: {rslt}, 높이: {middle}")


# 순차탐색
# import sys
# sys.stdin = open("input.txt", "r")

# n, m = map(int, input().split())
# ddeok = list(map(int, input().split()))

# ddeok.sort()

# print(ddeok)

# height = ddeok[n-1]
# rslt = 0
# while rslt < m:
#     rslt = 0
#     height -= 1
#     for i in ddeok:
#         if i < height:
#             continue
#         rslt += i - height

# print(f"떡의 양: {rslt}, 높이: {height}")
