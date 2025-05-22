import sys
sys.stdin = open("input.txt", "r")

n, m = map(int, input().split())
ddeok = list(map(int, input().split()))

ddeok.sort()

print(ddeok)

height = ddeok[n-1]
rslt = 0
while rslt < m:
    rslt = 0
    height -= 1
    for i in ddeok:
        if i < height:
            continue
        rslt += i - height

print(f"떡의 양: {rslt}, 높이: {height}")