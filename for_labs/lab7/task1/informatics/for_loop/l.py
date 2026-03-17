a = input()
count = 0
b = len(a)-1
a = str(a)
for i in a:
    x = int(i) * (2**b)
    count += x
    b -= 1
print(count)