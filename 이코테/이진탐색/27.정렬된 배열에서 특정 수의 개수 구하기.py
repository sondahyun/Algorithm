from bisect import bisect_left, bisect_right
import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

n, x = map(int, input().split())
n_list = list(map(int, input().split()))

print(bisect_right(n_list, x)-bisect_left(n_list, x))
