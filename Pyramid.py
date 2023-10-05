#simpul half piramid
'''
n = int(input("No. of rows: "))
for i in range(n):
    for j in range(i+1):
        print('* ', sep="", end='')
    print()


n = n = int(input("No. of rows: "))
for j in range(1, n+1):
    print('* '*j)
'''
#simpul right sided piramid
'''
n = int(input("No. of rows: "))
k = 2*n-2
for i in range(n):
    for j in range(k):
        print(end=' ')
    k-=2
    for j in range(i+1):
        print('* ', end='')
    print()
'''
#Downwards left sided half piramid
'''
n = n = int(input("No. of rows: "))

for i in range(n, 0, -1):
    for j in range(i):
        print('* ', sep='', end='')
    print()
'''
#Downwards right sided half piramid
'''
rows = 5
i = rows
while i >= 1:
    j = rows
    while j > i:
        # display space
        print(' ', end=' ')
        j -= 1
    k = 1
    while k <= i:
        print('*', end=' ')
        k += 1
    print()
    i -= 1
'''
#full piramid/equilateral triangle
'''
n = n = int(input("No. of rows: "))

for i in range(n):
    for j in range(n-i):
        print(end=" ")
    for j in range(i+1):
        print('*', end=" ")
    print()
'''
#full reverse piramid
'''
n = 5
k = 2*n-2
for i in range(n, 0, -1):
    for j in range(k):
        print(' ', sep='', end='')
    k+=1
    for j in range(1,i+1):
        print('* ', sep="", end='')
    print()
'''
#Vertical triamgle
'''
n = int(input("No. of rows: "))
for i in range(n):
    for j in range(i+1):
        print('* ', sep="", end='')
    print()
for i in range(n, 0, -1):
    for j in range(i-1):
        print('* ', end="")
    print()
'''
#Vertical traingle but from left
'''
rows = 5
i = 1
while i <= rows:
    j = i
    while j < rows:
        # display space
        print(' ', end=' ')
        j += 1
    k = 1
    while k <= i:
        print('*', end=' ')
        k += 1
    print()
    i += 1

i = rows
while i >= 1:
    j = i
    while j <= rows:
        print(' ', end=' ')
        j += 1
    k = 1
    while k < i:
        print('*', end=' ')
        k += 1
    print('')
    i -= 1
'''
#Hourglass pattern
'''
n = 5
for i in range(n, 0, -1):
    for j in range(n-i):
        print(end=' ')
    for j in range(i):
        print(' *', sep="", end="")
    print()
for i in range(n):
    for j in range(n-i):
        print(" ", end='')
    for j in range(i+1):
        print('*', sep="", end=" ")
    print()
'''
#Dizmond Style
'''
n = 5
for i in range(n):
    for j in range(n-i):
        print(end=" ")
    for j in range(i):
        print('* ', end="")
    print()
for i in range(n, 0, -1):
    for j in range(n-i):
        print(' ', end='')
    for j in range(i):
        print('*', end=" ")
    print()
'''
