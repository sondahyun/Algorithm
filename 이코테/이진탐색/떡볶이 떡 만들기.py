import sys
import os
print("현재 작업 디렉토리:", os.getcwd())
print("input.txt 존재함?:", os.path.exists("input.txt"))

sys.stdin = open("input.txt", "r")


n, m = map(int, input().split())
ddeok = list(map(int, input().split()))

ddeok.sort()

print(ddeok)


start = 0
end = ddeok[n-1]

while start <= end:
    rslt = 0
    middle = (start + end) // 2
    for i in ddeok:
        if i < middle:
            continue
        rslt += i - middle
    if rslt < m:
        end = middle - 1
    if rslt > m:
        start = middle + 1
    if rslt == m:
        break

print(f"떡의 양: {rslt}, 높이: {middle}")


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
