# 값이 특정 범위에 속하는 데이터의 개수 구하기
from bisect import bisect_left, bisect_right
import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

n, x = map(int, input().split())
n_list = list(map(int, input().split()))

print(bisect_right(n_list, x)-bisect_left(n_list, x))
