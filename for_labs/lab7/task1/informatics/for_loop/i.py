x = int(input())
count = 0
for i in range(x,0,-1):
    if (x % i == 0):
        count = count + 1
print(count)