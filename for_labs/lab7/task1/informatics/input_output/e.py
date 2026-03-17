a = int(input())
b = int(input())
c = 109;
if (a > 0):
    print((a*b) % c)
else:
    print(c -((-a*b)%c))