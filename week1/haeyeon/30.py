n = int(input())
array = []

for i in range(n):
    array.append(int(input()))



for i in range(2, max(array) + 1):
    check = True
    rest = array[0] % i
    for j in array:
        if j % i == rest:
            pass
        else:
            check = False
            break
    if check == True:
        print(i, end=' ')