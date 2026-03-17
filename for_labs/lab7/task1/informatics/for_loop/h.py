x = int(input())
for i in range(x,0,-1):
    if (x % i == 0):
        print(i, end = " ")