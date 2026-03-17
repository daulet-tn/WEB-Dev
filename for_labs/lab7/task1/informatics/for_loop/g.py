x = int(input())
a = 300001
for i in range(x,1,-1):
    if (x % i == 0 and i < x):
        a = i
print(a)