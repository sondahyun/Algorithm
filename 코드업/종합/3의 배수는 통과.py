a = int(input())
b = 0
while a > b:
    b+=1
    if b % 3 == 0:
        continue
    print(b, end=" ")
    

"""
a = int(input())
b = 1
while a >= b:
    if b % 3 == 0:
        b+=1
        continue
    print(b, end=" ")
    b+=1
"""
