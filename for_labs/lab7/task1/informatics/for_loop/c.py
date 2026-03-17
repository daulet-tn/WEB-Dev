a = int(input())
b = int(input())
for i in range(a, b+1):
    for j in range (i+1):
        if (j * j == i):
            print(i)